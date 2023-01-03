package summerProject;
import java.util.Scanner;
public class EvenOddZero {

	public static void main(String[] args) {
		// outputs word Even or Odd or Zero depending upon if input is even or odd or zero
		
		//declare variables
		Scanner scn = new Scanner(System.in);
		double user;
		
		//ask user
		System.out.println("Enter a number:");
		user = scn.nextDouble();
	
		//calculate and print answer
		if(user%2==0&&user!=0) {
			System.out.println("Even");
		}
		else {
			if(user==0) {
				System.out.println("Zero");
			}
			else {
				System.out.println("Odd");
			}
		}
		
		scn.close();
	}

}
