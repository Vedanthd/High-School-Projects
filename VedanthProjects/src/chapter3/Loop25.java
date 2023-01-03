package chapter3;

public class Loop25 {

	public static void main(String[] args) {
		// Determine and print the number of times the character 'a' appears in the String variable str
		
		String str = "analyze";
		int num = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				num++;
			}
		}

		System.out.println("There were "+num+" a's in your string");
	}

}
