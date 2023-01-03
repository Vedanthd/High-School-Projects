package chapter3;

import java.util.Scanner;
public class maxOfTwo {

	public static void main(String[] args) {
		// Write a method called maxOfTwo that accepts two integer parameters and returns the larger of the two.
	
		//declare variable
		Scanner scn = new Scanner(System.in);
		int in, in2, max;
		
		//ask user
		System.out.println("Enter your first integer:");
		in = scn.nextInt();
		System.out.println("Enter your second integer:");
		in2 = scn.nextInt();

		//calculate and print answer
		System.out.println(Math.max(in2, in));
		
		scn.close();
	}

}
