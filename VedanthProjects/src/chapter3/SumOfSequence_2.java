package chapter3;

import java.util.Scanner;
public class SumOfSequence_2 {

	public static void main(String[] args) {
		// Write a program for the following series. Number of steps inputs form user. SUM = 12-32+52-72+...
		
		//declare variables
		Scanner scn = new Scanner(System.in);
		int sum=0, input; 

		//ask user
		System.out.println("Enter a number of steps for the sequence to perform:");
		input = scn.nextInt();
		
		//calculate and print answer
		int num = 12;
		
		if(input%2!=0) {
		for(int i =1; i<=input-2; i++) {
			
			sum+=num-(num+20);
			num+=40; 
		}
		sum+=num;
		System.out.println("The sum is: "+sum);
		}
		else{
				for(int i =1; i<=input/2; i++) {
					
					sum+=num-(num+20);
					num+=40; 
				}
				System.out.println("The sum is: "+sum);
		}
		scn.close();

	}

}
