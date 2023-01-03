package chapter3;
import java.util.Scanner;
public class SumOfSequence_3 {
	
	public static void main(String[] args) {
		// Write a program to generate the following series A C E G I ... character
		
		//declare variables
		Scanner scn = new Scanner(System.in);
		char input; 
		
		//ask user 
		System.out.println("Enter a capital letter from the English Alphabet for the sequence to end at:");
		input = scn.next().charAt(0);
		
		//calculate and print answer
		for(int i = 65; i<=input; i+=2) {
			System.out.print((char)i+" ");
		}

		scn.close();
	}

}
