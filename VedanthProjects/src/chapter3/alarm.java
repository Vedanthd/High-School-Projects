package chapter3;
import java.util.Scanner;
public class alarm {

	public static void main(String[] args) {
		
		//declare variable
		Scanner scn = new Scanner(System.in);
		int input;
		
		//ask user
		System.out.println("Enter the number of times to repeat the alarm:");
		input = scn.nextInt();
		
		//validation loop
		while(input<1) {
			System.out.println("Error! Enter an int greater than 1:");
			input = scn.nextInt();
		}
		
		//output
		for(int i=1; i<=input; i++) {
			System.out.println("Alarm!");
		}
		
		scn.close();

	}

}
