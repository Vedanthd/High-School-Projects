package chapter3;

import java.util.Scanner;
public class countA {

	public static void main(String[] args) {
		//Write a method called countA that accepts a String parameter and returns the number of times the character ‘A’ is found in the string.
		
		//declare variable
		String in;
		Scanner scn = new Scanner(System.in);
		
		//ask user
		System.out.println("Enter a string: ");
		in = scn.nextLine();
		
		//calculate
		int countA = 0;
		for(int i = 0; i<in.length(); i++) {
			if(in.charAt(i)=='A'){
				countA++;
			}
		}
		
		//print answer
		System.out.println("The number of times 'A' was in the string: " +countA);
		scn.close();
	}

}
