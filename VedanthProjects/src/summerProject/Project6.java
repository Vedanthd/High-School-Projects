package summerProject;
import java.util.Scanner;
public class Project6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int totalSec, hours, min, sec;
		
		System.out.println("Enter the amount of hours:");
		hours = scn.nextInt();
		System.out.println("Enter the amount of minutes:");
		min = scn.nextInt();
		System.out.println("Enter the amount of seconds:");
		sec = scn.nextInt();
		
		totalSec = hours*3600+min*60+sec;
		
		System.out.println(hours+" hour(s), "+min+" minute(s), and "+sec+" second(s) is equivalent to "+totalSec+" seconds.");
		
		scn.close();

	}
}
