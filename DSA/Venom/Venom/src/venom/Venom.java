package venom;

import java.util.ArrayList;

import javax.lang.model.util.SimpleTypeVisitor14;

/**
 * The Venom class represents a binary search tree of SymbioteHost objects.
 * Venom is a sentient alien symbiote with a liquid-like form that requires a
 * host to bond with for its survival. The host is granted superhuman abilities
 * and the symbiote gains a degree of autonomy. The Venom class contains methods
 * that will help venom find the most compatible host. You are Venom.
 * 
 * @author Ayla Muminovic
 * @author Shane Haughton
 * @author Elian D. Deogracia-Brito
 */
public class Venom {
    private SymbioteHost root;

    /**
     * DO NOT EDIT THIS METHOD
     * 
     * Default constructor.
     */
    public Venom() {
        root = null;
    }

    /**
     * This method is provided to you
     * Creates an array of SymbioteHost objects from a file. The file should
     * contain the number of people on the first line, followed by the name,
     * compatibility, stability, and whether they have antibodies on each
     * subsequent line.
     * 
     * @param filename the name of the file
     * @return an array of SymbioteHosts (should not contain children)
     */
    public SymbioteHost[] createSymbioteHosts(String filename) {
        // DO NOT EDIT THIS METHOD
        StdIn.setFile(filename);
        int numOfPeople = StdIn.readInt();
        SymbioteHost[] people = new SymbioteHost[numOfPeople];
        for (int i = 0; i < numOfPeople; i++) {
            StdIn.readLine();
            String name = StdIn.readLine();
            int compatibility = StdIn.readInt();
            int stability = StdIn.readInt();
            boolean hasAntibodies = StdIn.readBoolean();
            SymbioteHost newPerson = new SymbioteHost(name, compatibility, stability, hasAntibodies, null, null);
            people[i] = newPerson;
        }
        return people;
    }

    /**
     * Inserts a SymbioteHost object into the binary search tree.
     * 
     * @param symbioteHost the SymbioteHost object to insert
     */
    public void insertSymbioteHost(SymbioteHost symbioteHost) {
        if (root==null) {
            root = symbioteHost;
            return;
        }

        SymbioteHost ptr = root;
        while (ptr!=null) {
            int cmp = symbioteHost.getName().compareTo(ptr.getName());
            if(cmp>0){
                if(ptr.getRight()==null){
                    ptr.setRight(symbioteHost);
                    return;
                }else{
                    ptr = ptr.getRight();
                }            
            }else{
                if(cmp<0){
                    if(ptr.getLeft()==null){
                        ptr.setLeft(symbioteHost);
                        return;
                    }else{
                        ptr = ptr.getLeft();
                    }
                }else{
                    ptr.setMentalStability(symbioteHost.getMentalStability());
                    ptr.setSymbioteCompatibility(symbioteHost.getSymbioteCompatibility());
                    ptr.setHasAntibodies(symbioteHost.hasAntibodies());
                    return;
                }
            }
        }
    }

    /**
     * Builds a binary search tree from an array of SymbioteHost objects.
     * 
     * @param filename filename to read
     */
    public void buildTree(String filename) {
        SymbioteHost[] list = createSymbioteHosts(filename);
        for(SymbioteHost s:list){
            insertSymbioteHost(s);
        }
    }

    /**
     * Finds the most compatible host in the tree. The most compatible host
     * is the one with the highest suitability that does not have antibodies.
     * PREorder traversal is used to traverse the tree. The host with the highest suitability
     * is returned. If the tree is empty, null is returned.
     * 
     * USE the calculateSuitability method on a SymbioteHost instance to get
     * a host's suitability.
     * 
     * @return the most compatible SymbioteHost object
     */
    public SymbioteHost findMostSuitable() {
        if(root==null){
            return null;
        }
        return pretraverse(root, root);
    }

    private SymbioteHost maxSuitability(SymbioteHost x, SymbioteHost y){
        if (x.calculateSuitability()>y.calculateSuitability()) {
            return x;
        }
        else{
            return y;
        }
    }

    private SymbioteHost pretraverse(SymbioteHost x,SymbioteHost max){
        if(x==null){
            return max;
        }
        max = maxSuitability(x, max);
        max = pretraverse(x.getLeft(), max);
        max = pretraverse(x.getRight(), max);
        return max;
    }


    /**
     * Finds all hosts in the tree that have antibodies. INorder traversal is used to
     * traverse the tree. The hosts that have antibodies are added to an
     * ArrayList. If the tree is empty, null is returned.
     * 
     * @return an ArrayList of SymbioteHost objects that have antibodies
     */
    public ArrayList<SymbioteHost> findHostsWithAntibodies() {
        if(root==null){
            return null;
        }
        
        ArrayList<SymbioteHost> out = new ArrayList<SymbioteHost>();
        intraverse(root, out); 
        return out;
    }

    private void intraverse(SymbioteHost x, ArrayList<SymbioteHost> q){
        if(x==null){
            return;
        }

        intraverse(x.getLeft(), q);
        if(x.hasAntibodies()){
            q.add(x);
        }
        intraverse(x.getRight(), q);
    }



    /**
     * Finds all hosts in the tree that have a suitability between the given
     * range. The range is inclusive. Level order traversal is used to traverse the tree. The
     * hosts that fall within the range are added to an ArrayList. If the tree
     * is empty, null is returned.
     * 
     * @param minSuitability the minimum suitability
     * @param maxSuitability the maximum suitability
     * @return an ArrayList of SymbioteHost objects that fall within the range
     */
    public ArrayList<SymbioteHost> findHostsWithinSuitabilityRange(int minSuitability, int maxSuitability) {
        if(root==null){
            return null;
        }
        ArrayList<SymbioteHost> list = new ArrayList<>();
        leveltraverse(minSuitability,maxSuitability,root,list);
        return list; // UPDATE this line, provided so code compiles
    }

    private void leveltraverse(int min, int max, SymbioteHost x, ArrayList<SymbioteHost> out){
        if(x==null){
            return;
        }
        Queue<SymbioteHost> q = new Queue<>();
        q.enqueue(x);
        while (!q.isEmpty()) {
           SymbioteHost current = q.dequeue();
           if(current.calculateSuitability()<=max&&current.calculateSuitability()>=min){
            out.add(current);
           }
           if (current.getLeft() != null) {
            q.enqueue(current.getLeft());
           }
           if (current.getRight() != null) {
            q.enqueue(current.getRight());
           }
        }

    }

    /**
     * Deletes a node from the binary search tree with the given name.
     * If the node is not found, nothing happens.
     * 
     * @param name the name of the SymbioteHost object to delete
     */
    public void deleteSymbioteHost(String name) {
        SymbioteHost ptr=root;
        SymbioteHost parent = null;
        while (ptr!=null) {
            int cmp = name.compareTo(ptr.getName());
            
            if ((ptr.getName().equals(name))) {
                break;
            }

            parent = ptr;
            if (cmp<0) {
                ptr=ptr.getLeft();
            }else{
                ptr=ptr.getRight();
            }
        }
        //case 1 no children
        if(ptr!=null){
            if(ptr.getLeft()==null&&ptr.getRight()==null){
                if(ptr==root){
                    root=null;
                }else{
                    if(parent.getLeft()==ptr){
                        parent.setLeft(null);
                    }else{
                        parent.setRight(null);
                    }
                }
            }else{
            //case 2 one child
            if(ptr.getLeft()==null||ptr.getRight()==null){
                SymbioteHost child = getChildCase2(ptr);
                if(ptr==root){
                    root=null;
                }else{
                    if(parent.getLeft()==ptr){
                        parent.setLeft(child);
                    }else{
                        parent.setRight(child);
                    }
                }
            }else{
                //case 3 two children
                SymbioteHost iOS = ptr.getRight();
                SymbioteHost iOSParent = ptr;
                while (iOS.getLeft()!=null) {
                    iOSParent = iOS;
                    iOS =iOS.getLeft();
                }
                ptr.setName(iOS.getName());
                ptr.setHasAntibodies(iOS.hasAntibodies());
                ptr.setMentalStability(iOS.getMentalStability());
                ptr.setSymbioteCompatibility(iOS.getSymbioteCompatibility());
                
                if(iOSParent.getLeft()==iOS){
                    iOSParent.setLeft(iOS.getRight());
                }else{
                    iOSParent.setRight(iOS.getRight());
                }
                
            }
        }
    }

    }

    private SymbioteHost getChildCase2(SymbioteHost x){
        if(x.getRight()!=null){
            return x.getRight();
        }
        return x.getLeft();
    }

    /**
     * Challenge - worth zero points
     *
     * Heroes have arrived to defeat you! You must clean up the tree to
     * optimize your chances of survival. You must remove hosts with a
     * suitability between 0 and 100 and hosts that have antibodies.
     * 
     * Cleans up the tree by removing nodes with a suitability of 0 to 100
     * and nodes that have antibodies (IN THAT ORDER).
     */
    public void cleanupTree() {
        // WRITE YOUR CODE HERE
    }

    /**
     * Gets the root of the tree.
     * 
     * @return the root of the tree
     */
    public SymbioteHost getRoot() {
        return root;
    }

    /**
     * Prints out the tree.
     */
    public void printTree() {
        if (root == null) {
            return;
        }

        // Modify no. of '\t' based on depth of node
        printTree(root, 0, false, false);
    }

    private void printTree(SymbioteHost root, int depth, boolean isRight, boolean isLeft) {
        System.out.print("\t".repeat(depth));

        if (isRight) {
            System.out.print("|-R- ");
        } else if (isLeft) {
            System.out.print("|-L- ");
        } else {
            System.out.print("+--- ");
        }

        if (root == null) {
            System.out.println("null");
            return;
        }

        System.out.println(root);

        if (root.getLeft() == null && root.getRight() == null) {
            return;
        }

        printTree(root.getLeft(), depth + 1, false, true);
        printTree(root.getRight(), depth + 1, true, false);
    }
}
