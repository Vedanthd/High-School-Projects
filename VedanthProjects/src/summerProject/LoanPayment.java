package summerProject;
import java.util.Scanner;
import java.text.DecimalFormat;
public class LoanPayment {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");
		double account, principal, rate, time, months, mPayment;
		
		System.out.println("Enter the number of years:");
		time = scn.nextDouble();
		System.out.println("Enter the principal:");
		principal = scn.nextDouble();
		System.out.println("Enter the annual interest rate as a decimal:");
		rate = scn.nextDouble();
		
		months = time*12;
		account = principal * Math.exp((rate*time));
		mPayment = account/months;
		
		System.out.println("Your monthly payment for "+time+" years is around: $"+df.format(mPayment));
		System.out.println("Price of total loan: $"+df.format(account));

		scn.close();
	}

}
