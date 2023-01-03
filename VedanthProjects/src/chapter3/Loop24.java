package chapter3;
import java.util.Scanner;
public class Loop24 {

	public static void main(String[] args) {
		// Read 10 values from the user and print the lowest and highest value
		
		Scanner scn = new Scanner(System.in);
		int max, min, num;
		
		System.out.println("Enter a number:");
		num = scn.nextInt();
		max = num;
		min = num;
		
		for(int i = 1; i<=9; i++){
			System.out.println("Enter a number:");
			num = scn.nextInt();
			if(num<min) {
				min=num;
			}
			if(num>max) {
				max=num;
			}
		}
		
		System.out.println("Max:"+max);
		System.out.println("Min:"+min);
		scn.close();
	}

}
