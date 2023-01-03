package chapter3;

import java.util.Scanner;
public class larger {

	public static void main(String[] args) {
		/*
		 * Write a method called larger that accepts two floating point parameters (of type double) and returns true if the first parameter 
		 * is greater than the second, and false otherwise. You must use Math.abs to compare floating point values. 
		 */

		Scanner scn = new Scanner(System.in);
		double in, in2;
		boolean output;
		
		System.out.println("Enter your first parameter:");
		in = scn.nextDouble();
		System.out.println("Enter your second parameter:");
		in2 = scn.nextDouble();
		
		
		if(Math.abs(in-in2)<0.00000001) {
			output = false;
		}
		else {
			if(in>in2) {
				output = true;
			}
			else {
				output = false;
			}
		}

		
		System.out.println(output);
		
		scn.close();

	}

}
