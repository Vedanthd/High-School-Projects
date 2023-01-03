package chapter3;

public class Loop28 {

	public static void main(String[] args) {
		/* Print a sequence of asterisk characters in the following configuration,  continuing for LINES number of asterisks 
		   *
		    *
		     *
		      *
		       *
		        *
		         *
		 */
		final int LINES = 7;

		for(int i = 0; i<LINES; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
	}

}
