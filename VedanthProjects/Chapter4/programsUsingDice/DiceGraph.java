package programsUsingDice;
import java.util.Scanner;
public class DiceGraph {

	public static void main(String[] args) {
		/*
		 * Dice Graph: In order to do this program you must use PairOfDice class. Prompt user to enter how many
		times they will like to roll a pair of 6-sided dice. Then find number of time sum of roll of pair of dice is 2, 3,
		… 12. Finally draw a line graph-representing the outcome of this experiment.
		 */

		PairOfDice die = new PairOfDice();
		int numRoll;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number of times to roll die:");
		numRoll = scn.nextInt();
		
		int count1=0, count2=0, count3=0, count4=0, count5=0, count6=0, count7=0, count8=0, count9=0, count10=0, count11=0, count12=0;
		
		for(int i = 0; i<numRoll; i++) {
			die.roll();
			int sum = die.sum();
			if(sum==1) {
				count1++;
			}else {
				if(sum==2) {
					count2++;
				}else {
					if(sum==3) {
						count3++;
					}else {
						if(sum==4) {
							count4++;
						}else {
							if(sum==5) {
								count5++;
							}else {
								if(sum==6) {
									count6++;
								}else {
									if(sum==7) {
										count7++;
									}else {
										if(sum==8) {
											count8++;
										}else {
											if(sum==9) {
												count9++;
											}else { 
												if(sum==10) {
													count10++;
												}else {
													if(sum==11) {
														count11++;
													}else {
														if(sum==12) {
															count12++;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.print("1:  ");
		for(int i =0; i<count1; i++) 
			System.out.print("*");
		System.out.println();
		
		System.out.print("2:  ");
		for(int i =0; i<count2; i++) 
			System.out.print("*");
		System.out.println();
		
		System.out.print("3:  ");
		for(int i =0; i<count3; i++) 
			System.out.print("*");
		System.out.println();
		
		System.out.print("4:  ");
		for(int i =0; i<count4; i++) 
			System.out.print("*");
		System.out.println();
		
		System.out.print("5:  ");
		for(int i =0; i<count5; i++) 
			System.out.print("*");
		System.out.println();
		
		System.out.print("6:  ");
		for(int i =0; i<count6; i++) 
			System.out.print("*");
		System.out.println();
		
		System.out.print("7:  ");
		for(int i =0; i<count7; i++) 
			System.out.print("*");
		System.out.println();
		
		System.out.print("8:  ");
		for(int i =0; i<count8; i++) 
			System.out.print("*");
		System.out.println();
		
		System.out.print("9:  ");
		for(int i =0; i<count9; i++) 
			System.out.print("*");
		System.out.println();
		
		System.out.print("10: ");
		for(int i =0; i<count10; i++) 
			System.out.print("*");
		System.out.println();
		
		System.out.print("11: ");
		for(int i =0; i<count11; i++) 
			System.out.print("*");
		System.out.println();
		
		System.out.print("12: ");
		for(int i =0; i<count12; i++) 
			System.out.print("*");
		System.out.println();
		
		scn.close();
	}
}
