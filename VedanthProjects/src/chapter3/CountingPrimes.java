package chapter3;
import java.util.Scanner;
public class CountingPrimes {

	public static void main(String[] args) {
		/* Write a program PrimeCounter that takes a command line argument N and finds the number of primes less than or equal to N. 
		 * Use it to print out the number of primes less than or equal to 10 million.
		 */

		Scanner scn = new Scanner(System.in);
		double in, op;
		
		//ask user
		System.out.println("Enter an integer: ");
		in=scn.nextDouble();
		
		int prime = 1;
		for(int i=3; i<=in; i+=2) {
			for(int j = 2; j<=(int)Math.sqrt(i); j++) {
				if(i%j!=0&&Math.sqrt(i)!=(int)Math.sqrt(i)) {
					prime++;
				}			
			}
		}
		
		
		System.out.println(prime);
	}

}
