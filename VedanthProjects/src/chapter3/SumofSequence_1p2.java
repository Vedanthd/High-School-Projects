package chapter3;

import java.util.Scanner;
public class SumofSequence_1p2 {

	public static void main(String[] args) {
		
		//declare variables
		Scanner scn = new Scanner(System.in);
		int n = 3;
		System.out.println("n="+n);
		
		//v
		//declare variables
		double sum = 0;
		int fact=1;
		
		//calculate
		for(int i = 1; i<=n; i++) {
			for(int j =1; j<=i; j++) {
				fact*=j;
			}
			sum +=(double)i/fact;
			fact = 1;
		}
		System.out.println("Program v: "+sum);

		//vi
		//declare variables
		sum = 0;
		fact = 1;
		int num = 1; 
		
		//calculate
		for(int i=1; i<=n; i++) {
			for(int j =1; j<=i+2; j++) {
				fact *=j;
			}
			sum +=(double)num/fact;
			fact = 1;
			num+=4;
		}
		
		//print answer
		System.out.println("Program vi: "+sum);
		
		//vii
		//initialize sum
		sum = 0;
		
		//calculate
		for(int i =1; i<=n; i++) {
			sum+=Math.pow(i, 2);
		}
		
		//print answer
		System.out.println("Program vii: "+sum);
		
		//viii
		//initialize sum
		sum = 0;
		
		
		//ask user
		System.out.println("Enter x value for program 8:");
		int x = scn.nextInt();
		
		//calculate
		for(int i =1; i<=n; i++) {
			sum+=1.0/Math.pow(x, i);
		}
		
		//print answer
		System.out.println("Program viii: "+sum);
		
		//ix
		//declare variables
		sum = 0; 
		num = 1;
		
		//calculate
		for(int i =1; i<=n; i++) {
			sum+=num;
			num+=2;
		}
		
		//print answer
		System.out.println("Program ix: "+sum);
		
		//x
		//declare variables
		sum = 0;
		num = 2;
		
		//calculate
		for(int i =1; i<=n; i++) {
			sum+=num;
			sum+=2;
		}
		
		//print answer
		System.out.println("Program x: "+sum);
		
		//xi
		//ask user and initialize variables
		System.out.println("Enter x value for program 11:");
		x = scn.nextInt();
		sum = x;
		
		//calculate
		for(int i =1; i<=n; i++) {
			sum+=Math.pow(x, i);
		}
		
		//print answer
		System.out.println("Program xi: "+sum);
		
		scn.close();
		
	}
}
