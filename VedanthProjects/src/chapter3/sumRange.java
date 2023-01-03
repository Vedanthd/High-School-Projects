package chapter3;

import java.util.Scanner;
public class sumRange {

	public static void main(String[] args) {
		/*
		 * Write a method called sumRange that accepts two integer parameters that represent a range. 
		 * Issue an error message and return zero if the second parameter is less than the first. 
		 * Otherwise, the method should return the sum of the integers in that range (inclusive).
		 */

		//declare variables
		int min, max;
		Scanner scn = new Scanner(System.in);
		
		//ask user
		System.out.println("Enter the minimum of the range:");
		min = scn.nextInt();
		int sum = min;
		System.out.println("Enter the maximum of the range:");
		max = scn.nextInt();
		
		
		//calculate and output
		if(max<min) {
			System.out.println("Error! The maximum should be larger than the minimum");
		}
		else {
			
			for(int i = min+1; i<=max; i++) {
				sum+=i;
			}
			System.out.println("Sum of the numbers within the range is: " +sum);
		}
		
		scn.close();
		
	}

}
