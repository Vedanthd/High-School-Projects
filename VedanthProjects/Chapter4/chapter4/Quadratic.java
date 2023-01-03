package chapter4;
import java.util.Scanner;
public class Quadratic {
	static int a,b,c;
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		//input from user
		System.out.println("Enter a:");
		a = scn.nextInt();
		System.out.println("Enter b:");
		b = scn.nextInt();
		System.out.println("Enter c:");
		c = scn.nextInt();
		
		//find discriminant
		discriminant();
		
		//print answer if root is real
		if(isRealRoots()) {
			System.out.println(plusRoots()+","+minusRoots());
		}
		else {
			System.out.println("Not real roots");
		}
	}

	public static double plusRoots() {
		double root = (-b + Math.sqrt(discriminant()))/(2.0*a);
		return root;
	}
	
	public static double minusRoots() {
		double root = (-b - Math.sqrt(discriminant()))/(2.0*a);
		return root;
	}

	public static double discriminant() {
		double D = (Math.pow(b,2)-4.0*a*c);
		return D;
	}
	
	public static boolean isRealRoots() {
		//checks if discriminant is less than 0, meaning no real roots
		boolean real = true;
		if(discriminant()<0) {
			real = false;
		}
		return real;
	}
}
