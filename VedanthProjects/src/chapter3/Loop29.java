package chapter3;

public class Loop29 {

	public static void main(String[] args) {
		/* Print the characters of a String variable str in a diagonal line downward. For example, if str contained "Compile", the output would be:
		   C
		    o
		     m
		      p
		       i
		        l
		         e
		 */

		String str = "Compile";
		
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println(str.charAt(i));
		}
	}

}
