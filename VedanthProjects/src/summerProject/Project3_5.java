package summerProject;
import java.util.Scanner;
public class Project3_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input;
		
		System.out.println("Enter a string and I will print it one character at a time:");
		input =scn.nextLine();
		
		for(int i=0; i<input.length(); i++) {
			System.out.println(input.charAt(i));
		}

		scn.close();
	}

}
