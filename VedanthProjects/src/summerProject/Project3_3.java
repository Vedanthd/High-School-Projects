package summerProject;
import java.util.Scanner;
public class Project3_3 {

	public static void main(String[] args) {
		//declare variables
		Scanner scn = new Scanner(System.in);
		int year;
		
		//ask user
		System.out.println("Enter a year in the Gregorian calander to check if it is a leap year:");
		year = scn.nextInt();
		
		//calculate and print
		while(year!=-1) {
			if(year<1582) {
				System.out.println("Error. The year entered is not in the Gregorian calander!");
			}
			else {
				if(year%400==0||year%4==0&&year%100!=0) {
					System.out.println(year+" is a leap year");
				}
				else {
					System.out.println(year+" is not a leap year");
				}
			}
			System.out.println("Enter another year in the Gregorian calender to check if it is a leap year: (Enter -1 to cancel)");
			year = scn.nextInt();
		}
		
		scn.close();

	}
}
