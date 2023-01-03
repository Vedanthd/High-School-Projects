package chapter3;
import java.util.Scanner;
public class MedianOf5 {

	public static void main(String[] args) {
		/*
		 * Write a program that takes five distinct integers from the user and prints the median value (the value such that two of the others are smaller and two are larger)
		 */

		Scanner scn = new Scanner(System.in);
		int val;
		int median;
		int min2, max2;
		int max, min;
		
		System.out.println("Enter your first value out of five:");
		val=scn.nextInt();
		median = val;
		min = val;
		max2 = val;
		max=val;
		min2=val;
		

		for(int i =1; i<=4; i++) {
			System.out.println("Enter value:");
			val=scn.nextInt();
			
			max2 = Math.min(max, Math.max(val, max2));
            max = Math.max(val, max);
            min2 = Math.max(min,Math.min(val, min2));
            min = Math.min(val, min);
			
            if(val>min2&&val<max2) {
            	median =val;
            }
		}
		
		System.out.println(median);
		scn.close();
	
	}

}
