package summerProject;
import java.util.Scanner;
public class Project3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float num,num2;
		 
		
		System.out.println("Enter a float number:");
		num = scn.nextFloat();
		System.out.println("Enter another float number:");
		num2 = scn.nextFloat();
		
		
		System.out.println("The sum of the two floats is " +(num+num2));
		System.out.println("The difference between the two floats is " + Math.abs(num-num2));
		System.out.println("The product of the two numbers is: " + (num*num2));
		scn.close();
	}

}
