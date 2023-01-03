package summerProject;
import java.util.Scanner;
public class Project2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int num, num2, num3;
		
		
		System.out.println("I will find the average of 3 integers. Enter your first integer:");
		num = scn.nextInt();
		System.out.println("Enter your second integer:");
		num2 = scn.nextInt();
		System.out.println("Enter your third integer:");
		num3 = scn.nextInt();
		
		double avg =(num+num2+num3)/3.0;

		System.out.println("The average is "+avg);
		scn.close();
	}

}
