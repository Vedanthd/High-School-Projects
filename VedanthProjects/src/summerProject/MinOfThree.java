package summerProject;
import java.util.Scanner;
public class MinOfThree {

	public static void main(String[] args) {
		// outputs the greatest of these numbers

		//declare variable
		Scanner scn = new Scanner(System.in);
		double num, num2, num3;
		
		//ask user
		System.out.println("Enter your first number:");
		num = scn.nextDouble();
		System.out.println("Enter your second number:");
		num2 = scn.nextDouble();
		System.out.println("Enter your third number:");
		num3 = scn.nextDouble();
		
		//calculate and print
		if(num<=num2&&num<=num3) {
			System.out.println("The min is: "+num);
		}
		else{
			if(num2<=num&&num2<=num3) {
				System.out.println("The min is: "+num2);
			}
			else {
				System.out.println("The min is: "+num3);
			}
		}
		
		scn.close();

	}

}
