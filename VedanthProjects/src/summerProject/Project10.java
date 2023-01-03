package summerProject;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Project10 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.###");
		double side, side2, side3, area, s;
		
		System.out.println("Enter the length of side 1:");
		side = scn.nextDouble();
		System.out.println("Enter the length of side 2:");
		side2 = scn.nextDouble();
		System.out.println("Enter the length of side 3:");
		side3 = scn.nextDouble();
		
		
		s = (side+side2+side3)/2.0;
		area = Math.sqrt(s*(s-side)*(s-side2)*(s-side3));
		
		System.out.println("The area of the triangle is "+df.format(area)+" units sqaured");
		
		scn.close();
	}

}
