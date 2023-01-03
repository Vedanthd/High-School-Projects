package summerProject;
import java.util.Scanner;
public class Project8 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		double distance,x,y,x2,y2;
		
		System.out.println("Enter the x coordinate for point one");
		x = scn.nextDouble();
		System.out.println("Enter the y coordinate for point one");
		y = scn.nextDouble();
		System.out.println("Enter the x coordinate for point two");
		x2 = scn.nextDouble();
		System.out.println("Enter the y coordinate for point two");
		y2 = scn.nextDouble();
		
		distance = Math.sqrt(Math.pow((x2-x),2)+Math.pow((y2-y),2));
		
		System.out.println("The distance between the two point is "+distance);
		scn.close();
	}

}
