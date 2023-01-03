package chapter3;

public class Loop26 {

	public static void main(String[] args) {
		// Print the characters stored in the String variable str backwards
		
		String str = "example";
		
		for(int i= str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}

	}

}
