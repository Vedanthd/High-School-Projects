package summerProject;
import java.util.Scanner;
public class Project3_2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int year;
		
		System.out.println("Enter the year:");
		year = scn.nextInt();
			
		//calculate and print
		if(year%400==0||year%4==0&&year%100!=0) {
			System.out.println(year+" is a leap year");
		}
			else {
			System.out.println(year+" is not a leap year");
			}
				
	scn.close();

	}
}
