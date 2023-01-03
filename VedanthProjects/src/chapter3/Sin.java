package chapter3;

import java.util.Scanner;

public class Sin {

	public static void main(String[] args) {
		//declare variables
		Scanner scn = new Scanner(System.in);
		int n;
		double sin, input, fact = 1.0;
		
		//ask user
		System.out.println("Enter the degree:");
		input = scn.nextDouble();
		sin = Math.toRadians(input);
		System.out.println("Enter the number of terms:");
		n = scn.nextInt();
		
		
		
		//compute
		int den = 3;
		for(int i =1; i<=n; i++ ) {
			//factorial
			for(int j =1; j<=den; j++) {
				fact*=j;
			}
			 
			//series
			if(i%2==0) {
				sin += Math.pow(sin, den)/fact;
			}
			else {
				sin -= Math.pow(sin, den)/fact;
			}
			den+=2;
		}
	
		//print answer
		System.out.println("Using the Taylor Expansion Series: " +sin);
		scn.close();


	}

}
