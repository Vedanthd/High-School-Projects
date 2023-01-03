package chapter3;

public class Loop27 {

	public static void main(String[] args) {
		// Print every other character in the String variable str starting with the first character
		
		String str = "String";
		
		for(int i=0; i<str.length(); i+=2) {
			System.out.print(str.charAt(i));
		}

	}

}
