package summerProject;
import java.util.Scanner;
public class Project3_4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num, sum=0;
		
		System.out.println("Enter an integer:");
		num = scn.nextInt();
		
		if(num<=2) {
			System.out.println("Error, enter an integer larger than 2");
		}
		else {
			for(int i=2;i<=num;i+=2) {
				sum+=i;
			}
		}
		System.out.println(sum);
		scn.close();
	}

}
