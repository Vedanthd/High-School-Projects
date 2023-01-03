package summerProject;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Project9 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.####");
		double radius, volume, sArea;
		
		System.out.println("Enter the radius of a sphere:");
		radius = scn.nextDouble();
		
		volume = (4.0/3)*Math.PI*Math.pow(radius, 3);
		sArea = 4*Math.PI*Math.pow(radius, 2);
	
		System.out.println("The surface area is "+df.format(sArea)+" units squared");
		System.out.println("The volume is "+df.format(volume)+" units cubed");

		scn.close();
	}

}
