package summerProject;

import java.util.Scanner;
public class TaxRate {

	public static void main(String[] args) {

		//declare variables
		Scanner scn = new Scanner(System.in);
		double pay, taxRate=0;
		
		//Ask user
		System.out.println("Enter the pay amount:");
		pay = scn.nextDouble();
		
		//calculate
		if(pay>100000) {
			taxRate=40;
		}
		else {
			if(pay>60000&&pay<=100000) {
				taxRate=30;
			}
			else {
				if(pay>30000&&pay<=60000) {
					taxRate=20;
				}
				else {
					if(pay>15000&&pay<=30000) {
						taxRate=10;
					}
					else {
						if(pay>5000&&pay<=15000) {
							taxRate=5;
						}
						else {
							if(pay<=5000) {
								taxRate=0;
							}
						}
					}
				}
			}
		}
			
		//print answer
		System.out.println("Your tax rate is "+taxRate+"% based on your pay");
		scn.close();

	}

}
