package summerProject;
import java.util.Scanner;
public class Project7 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int inputSec, hours, min, sec;
		
		System.out.println("Enter an amount of seconds:");
		inputSec = scn.nextInt();
		
		hours = inputSec/3600;
		min = (inputSec%3600)/60;
		sec = inputSec%60;

		System.out.println(inputSec+" seconds is equivalent to "+hours+" hour(s), "+min+" minute(s), and "+sec+" second(s)");
		scn.close();
	}

}
