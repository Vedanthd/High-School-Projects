package summerProject;
import java.util.Scanner;
public class Project5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float miles, kilometers;
		
		System.out.println("Enter a value of miles to be converted to kilometers:");
		miles = scn.nextFloat();
		
		kilometers = (miles*1.60935f);
		
		System.out.println(miles+" miles in kilometer is: "+kilometers);
		scn.close();
	}

}
