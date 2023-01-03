package summerProject;
import java.util.Scanner;
public class FlowChartTest {

	public static void main(String[] args) {
		int num;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter an int:");
		num = scn.nextInt();
		
		if(num%11==0||num%11==1) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
		
	}

}
