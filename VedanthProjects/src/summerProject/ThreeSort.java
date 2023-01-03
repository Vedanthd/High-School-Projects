package summerProject;

import java.util.Scanner;
public class ThreeSort {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b, c, min, max, mid;
		
		System.out.println("Enter your first integer:");
		a = scn.nextInt();
		System.out.println("Enter your second integer:");
		b = scn.nextInt();
		System.out.println("Enter your third integer:");
		c = scn.nextInt();
		
		min = Math.min(a, Math.min(b, c));
		max = Math.max(a, Math.max(b, c));
		mid = Math.max(Math.min(Math.max(a, b), c), Math.min(a, b));
		//math.min(math.max(a,b),c) will always exclude the highest value
		//Math.min(a,b), will also exclude the highest value, but be alternate to the previous line
		//maximum of those will give you the middle number
		
		System.out.println(min);
		System.out.println(mid);
		System.out.println(max);

		scn.close();
	}

}
