package summerProject;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Project3_1 {
	public static void main (String[] args) {
		
		//declare variables
		int sum = 0, value, count = 0;
		double average;
		DecimalFormat df = new DecimalFormat ("0.###");
		Scanner scn = new Scanner(System.in);
		
		//ask user
		System.out.print ("Enter an integer (0 to quit): ");
		value = scn.nextInt();

		//calculation
		if(value==0) {
			count++;
		}
		
		while (value != 0){	
		sum += value;
		System.out.println ("The sum so far is " + sum);
		System.out.println ("Enter an integer (0 to quit): ");
		value = scn.nextInt();
		count++;
		}
		
		//print answer
		System.out.println ("Number of values entered: " + count);
		average = (double)sum / count;
		
		System.out.println ("The average is " + df.format(average));
		scn.close();
	}
}
