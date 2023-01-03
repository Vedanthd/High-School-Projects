package summerProject;

public class MultiplicationTable {

	public static void main(String[] args) {
		int product;
		
		for(int factor=1; factor<=12; factor++) {
			for(int factor2=1; factor2<=12; factor2++) {
				System.out.print(factor*factor2+" ");
			}
			System.out.println();
		}

	}

}
