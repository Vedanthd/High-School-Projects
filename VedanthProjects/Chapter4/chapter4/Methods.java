package chapter4;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
	
	}
	
	public static void powersOfTwo() {
		for(int i=1; i<=10; i++) {
			 System.out.println((int)Math.pow(2,i));
		}
	}

	public static void alarm (int n) {
		if(n<1) 
			System.out.println("Error! Int must be greater than 1");
		
		//output
		for(int i=1; i<=n; i++) 
			System.out.println("Alarm!");
	}
	
	public static void sum100() {
		int sum =0;
		
		for(int i =1; i<=100; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}
	
	public static int maxOfTwo (int in, int in2) {
		return(Math.max(in2, in));
	}
	
	public static void sumRange(int min, int max) {
		int sum = min;
		
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
	}
	
	public static boolean larger(double in, double in2) {
		boolean output;
		
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
		
		return(output);
	}
	
	public static int countA(String in) {	
		//calculate
		int countA = 0;
		for(int i = 0; i<in.length(); i++) {
			if(in.charAt(i)=='A'){
				countA++;
			}
		}
	
		return(countA);
	}
	
	public static boolean evenlyDivisible(int in, int in2) {
		boolean output; 
		
		if(in==0||in2==0) {
			output=false;
		}
		else {
			if(in%in2==0||in2%in==0) {
				output = true;
			}
			else {
				output = false;
			}
		}
		
		return output;
	}
	
	public static float average(int in, int in2) {
		float avg =(float) (in+in2)/2;
		return avg;
	}
	
	public static float average(int in, int in2, int in3) {
		float avg =(float) (in+in2+in3)/3;
		return avg;
	}
	
	public static float average(int in, int in2, int in3, int in4) {
		float avg =(float) (in+in2+in3+in4)/4;
		return avg;
	}
	
	public static String multiConcat(String str, int in) {
		String output ="";
		if(in<2) {
			output=str;
		}
		else {
			for(int i = 0; i<in; i++ ) {
				output+=str;
			}
		}
		return output;
	}
	
	public static String multiConcat(String str) {
		String output =str+str;
		return output;
	}
	
	public static boolean isAlpha(char in) {
		boolean output = false;
		
		if((in >= 'a' && in <= 'z') || (in >= 'A' && in <= 'Z')) {
			output = true;
		}
		
		return output;
	}
	
}
