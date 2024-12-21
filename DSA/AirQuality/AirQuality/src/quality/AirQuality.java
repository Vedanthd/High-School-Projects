package quality;

import java.util.ArrayList;

/**
 * This class represents the AirQuality system which populates a hashtable with states and counties 
 * and calculates various statistics related to air quality.
 * 
 * This class is a part of the AirQuality project.
 * yhhuhyu
 * @author Anna Lu
 * @author Srimathi Vadivel
 */

public class AirQuality {

    private State[] states; // hash table used to store states. This HT won't need rehashing.

    /**
     * **DO NOT MODIFY THIS METHOD**
     * Constructor creates a table of size 10.
     */

    public AirQuality () {
        states  = new State[10];
    }     

    /**
     ** *DO NOT MODIFY THIS METHOD**
     * Returns the hash table.
     * @return the value held to represent the hash table
     */
    public State[] getHashTable() {
        return states;
    }
    
    /**
     * 
     * DO NOT UPDATE THIS METHOD
     * 
     * This method populates the hashtable with the information from the inputFile parameter.
     * It is expected to insert a state and then the counties into each state.
     * 
     * Once a state is added, use the load factor to check if a resize of the hash table
     * needs to occur.
     * 
     * @param inputLine A line from the inputFile with the following format:
     * State Name,County Name,AQI,Latitude,Longitude,Pollutant Name,Color
     */

    public void buildTable ( String inputFile ) {
        
        StdIn.setFile(inputFile); // opens the inputFile to be read
        StdIn.readLine();         // skips header
        
        while ( !StdIn.isEmpty() ) {

            String line = StdIn.readLine(); 
            State s = addState( line );
            addCountyAndPollutant(s, line );
        }
    }
    
    /**
     * Inserts a single State into the hash table states.
     * 
     * Note: No duplicate states allowed. If the state is already present, simply
     * return the State object. Otherwise, insert at the front of the list.
     * 
     * @param inputLine A line from the inputFile with the following format:
     * State Name,County Name,AQI,Latitude,Longitude,Pollutant Name,Color
     * 
     * USE: Math.abs("State Name".hashCode()) as the key into the states hash table.
     * USE: hash function as: hash(key) = key % array length
     * 
     * @return the State object if already present in the table or the newly created
     * State object inserted.
     */

    public State addState ( String inputLine ) {

        String[] arr = inputLine.split(",");
        String statename = arr[0];
        int key = Math.abs(statename.hashCode());
        State newState = new State(statename);

        
        State ptr = states[key%states.length];
        if(ptr==null){
            states[key%states.length] = newState;
            return newState;    
        }

        do{
            if(ptr.getName().equals(statename)){
                return ptr;
            }
            ptr = ptr.getNext();
        } while(ptr!=null);

        newState.setNext(states[key%states.length]);
        states[key%states.length] = newState;
        return newState;
 
    }
    
    /**
     * Returns true if the counties hash table (within State) needs to be resized (re-hashed) 
     *
     * Resize the hash table when (number of counties)/(array size) >= loadFactor
     * 
     * @return true if resizing needs to happen, false otherwise
     */

     public boolean checkCountiesHTLoadFactor ( State state ) {

	    // WRITE YOUR CODE HERE
	 
	    return (state.getNumberOfCounties())/(state.getCounties().length) >= state.getLoadFactor();
    }

    /**
     * Resizes (rehashes) the State's counties hashtable by doubling its size.
     * 
     * USE: county.hashCode() as the key into the State's counties hash table.
     */
    public void rehash ( State state ) {
        int newSize = state.getCounties().length*2;
        County[] rehashedArr = new County[newSize];

        for(int i = 0; i<state.getCounties().length; i++){
        County ptr = state.getCounties()[i];
            while(ptr!=null){
                County nextNode = ptr.getNext();
                ptr.setNext(rehashedArr[Math.abs(ptr.getName().hashCode()) % newSize]);
                rehashedArr[Math.abs(ptr.getName().hashCode()) % newSize] = ptr;
                ptr=nextNode;
            }
        }

        state.setCounties(rehashedArr);
    }

    /**
     * This method:
     * 1) Inserts the county (from the input line) into State, if not already present.
     *    Check the State's counties hash table load factor after inserting. The hash table may need
     *    to be resized.
     * 
     * 2) Then inserts the pollutant (from the input line) into County (from the input line), if not already present.
     *    If pollutant is present, update AQI.
     * 
     * Note: no duplicate counties in the State.
     * Note: no duplicate pollutants in the County.
     * 
     * @param inputLine A line from the inputFile with the following format:
     * State Name,County Name,AQI,Latitude,Longitude,Pollutant Name,Color
     * 
     * USE: Math.abs("County Name".hashCode()) as the key into the State's counties hash table.
     * USE: the hash function as: hash(key) = key % array length
     */

    public void addCountyAndPollutant ( State state, String inputLine ) {
        //input line stuff
        String[] input = inputLine.split(",");

        String countyName = input[1];
        double latitude = Double.parseDouble(input[3]);
        double longitutde = Double.parseDouble(input[4]);

        String pollutantIn = input[5];
        int AQI = Integer.parseInt(input[2]);
        String color = input[6];

        //creating new objects from inputLine
        County addingCounty = new County(countyName, latitude, longitutde, null);
        Pollutant addPollutant = new Pollutant(pollutantIn, AQI, color);

        //setting a ptr to the county hashtable
        int key =  Math.abs(countyName.hashCode());
        County ptr = state.getCounties()[key%state.getCounties().length];
        County foundCounty = null; 

        //search through SLL to see if county exists
        while (ptr != null) {
            if (ptr.getName().equals(countyName)) {
                foundCounty = ptr;
                break;
            }
            ptr = ptr.getNext();
        }

        //if county does not exist add to the hashtable
        if(foundCounty==null){
            foundCounty = addingCounty;
            state.addCounty(addingCounty);
        }

        //checking if need to rehash
        if(checkCountiesHTLoadFactor(state)){
            rehash(state);
            foundCounty = state.getCounties()[Math.abs(countyName.hashCode()) % state.getCounties().length];
            while (foundCounty != null && !foundCounty.getName().equals(countyName)) {
                foundCounty = foundCounty.getNext();
            }
        }

        //search through the found county's pollutant arraylist and change values if found
        ArrayList<Pollutant> pollutants = foundCounty.getPollutants();
        boolean foundPollutant = false;
        for (Pollutant p : pollutants) {
            if (p.getName().equals(pollutantIn)) {
                p.setAQI(AQI);
                p.setColor(color);
                foundPollutant = true;
                break;
            }
        }

        //if pollutant not found add it
        if (!foundPollutant) {
            pollutants.add(addPollutant);
        }
    
    }

    /**
     * Sets states' simple stats AQI for each State in the hash table.
     */
    public void setStatesAQIStats() {

        for(int i = 0; i<states.length; i++){
            //traversing states
            State ptr = states[i];
            while(ptr!=null){
                
                County maxCounty = null;
                County minCounty = null;
                double totalAQI = 0;
                int pollutantCount = 0;
                int maxAQI = 0;
                int minAQI = Integer.MAX_VALUE;

                //traverse counties
                for(int j = 0; j<ptr.getCounties().length;j++){
                    County ptr2 = ptr.getCounties()[j];

                    //traverse pollutants
                    while (ptr2!=null) {
                        for(Pollutant p: ptr2.getPollutants()){

                            pollutantCount++;
                            totalAQI+=p.getAQI();
                            if (p.getAQI() > maxAQI) {
                                maxAQI = p.getAQI();
                                maxCounty = ptr2;
                            }
                            if (p.getAQI() < minAQI) {
                                minAQI = p.getAQI();
                                minCounty = ptr2;
                            }

                        }
                        ptr2=ptr2.getNext();
                    }
                }
                double avgAQI=0;
                if(pollutantCount>0){
                    avgAQI = totalAQI/pollutantCount;
                }

                //set values for states
                ptr.setAvgAQI(avgAQI);
                ptr.setHighestAQI(maxCounty);
                ptr.setLowestAQI(minCounty);
                
                ptr = ptr.getNext();
                
            }
        }
        
    }

    /**
     * In this method you will find all the counties within a state that have the same parameter name
     * and above the AQI threshold.
     * 
     * @param stateName The name of the state
     * @param pollutantName The parameter name to filter by
     * @param AQIThreshold The AQI threshold
     * @return ArrayList<County> List of counties that meet the criteria
     */

    public ArrayList<County> meetsThreshold(String stateName, String pollutantName, int AQIThreshold) {
        ArrayList<County> thresholdList = new ArrayList<>();

        //get state in hashtable
        int stateKey = Math.abs(stateName.hashCode());
        State ptr = states[stateKey%states.length];
        while (!ptr.getName().equals(stateName)) {
            ptr = ptr.getNext();
        }

        //traverse counties
        for(County c:ptr.getCounties()){
            while(c!=null){

                //traverse through pollutants 
                ArrayList<Pollutant> current = c.getPollutants();
                for(Pollutant p:current){
                    if(p.getName().equals(pollutantName)&&p.getAQI()>=AQIThreshold){
                        thresholdList.add(c);
                    }
                }

                c= c.getNext();
            }
           
        }
        
        return thresholdList;
    } 

}
