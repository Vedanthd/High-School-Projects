package summerProject;
import java.util.Scanner;
public class EvenSum {

	public static void main(String[] args) {
		//declare variables
		Scanner scn = new Scanner(System.in);
		int input, sum=0, num=2;
		
		//ask user
		System.out.println("Enter a integer greater than or equal to 2:");
		input = scn.nextInt();
		
		//print and calculate
		if(input<2) {
			System.out.println("Error. Number entered must be greater than or equal to 2");
		}
		else{
			
			while(num<=input) {
				sum+=num;
				num+=2;
			}
			System.out.println("Sum of all integers between 2 and the input is: "+sum);
		}
		
		scn.close();

	}

}
