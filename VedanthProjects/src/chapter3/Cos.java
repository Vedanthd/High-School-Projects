package chapter3;

import java.util.Scanner;

public class Cos {

	public static void main(String[] args) {
		//declare variables
		Scanner scn = new Scanner(System.in);
		int n;
		double cos, input, x, fact = 1.0;
		
		//ask user
		System.out.println("Enter the degree:");
		input = scn.nextDouble();
		x = Math.toRadians(input);
		
		System.out.println("Enter the number of terms:");
		n = scn.nextInt();
		
		
		
		//compute
		int den = 2;
		cos = 1;
		for(int i =1; i<=n; i++ ) {
			//factorial
			for(int j =1; j<=den; j++) {
				fact*=j;
			}
			 
			//series
			if(i%2==0) {
				cos += Math.pow(x, den)/fact;
			}
			else {
				cos -= Math.pow(x, den)/fact;
			}
			den+=2;
		}
	
		//print answer
		System.out.println("Using the Taylor Expansion Series: " +cos);
		scn.close();


	}

}
