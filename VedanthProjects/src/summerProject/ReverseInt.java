package summerProject;
import java.util.Scanner;
public class ReverseInt {

	public static void main(String[] args) {
		
		//declare Scanner
		Scanner scn = new Scanner(System.in);
		final int BASE = 32;
		final double CONVERSION_FACTOR = 5.0 / 9.0;
		
		int fahrenheitTemp; // value to convert
		double celsiusTemp;
		
		System.out.println("Enter a Fahrenheit Temperature:");
		fahrenheitTemp = scn.nextInt();
		
		
		celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;
		System.out.println ("Fahrenheit Temperature: " + fahrenheitTemp);
		System.out.println ("Celsius Equivalent: " + celsiusTemp);
		scn.close();
	}

}
