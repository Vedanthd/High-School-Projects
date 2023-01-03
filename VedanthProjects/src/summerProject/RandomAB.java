package summerProject;
import java.util.Scanner;
public class RandomAB {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int min,max,rand;
		
		System.out.println("Enter a minimum value: ");
		min = scn.nextInt();
		System.out.println("Enter a maximum value: ");
		max = scn.nextInt();
		
		rand =(int) (min+Math.random()*(max-min));
		
		System.out.println(rand);
		scn.close();

	}

}
