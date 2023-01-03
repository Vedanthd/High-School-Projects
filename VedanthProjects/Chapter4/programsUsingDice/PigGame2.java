package programsUsingDice;
import java.util.Scanner;
public class PigGame2 {
	static PairOfDice die = new PairOfDice(10); //dice both have 10 faces
	static int pt, ct, pr, cr;
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(pt<200&&ct<200) {
			player();
			computer();
			if(pt>=200) {
				System.out.println("Player Wins!");
			}
			else {
				if(ct>=200)
				System.out.println("Computer Wins!");
			}
		}

	}
	
	public static void player() {
		System.out.println("Player turn!");
		boolean rollAgain = true;
		while(rollAgain) {
			rollDice();
			displayRoll();
			if(isSE()) {
				pt = 0;
				pr = 0;
				rollAgain = false;
				break;
			}
			else {
				if(isHSE()) {
					pr = 0;
					rollAgain = false;
					break;
				}
				else {
					if(isDouble10()) { //if both dice have face value of 10, give round total to computer
						ct+=pr;
						pr=0;
						break;
					}else {
						if(isDoubles()) {//if both dice have same value double it and add to round total
							pr+=(sumRoll()*2);
						}else {
							pr+=sumRoll();
						}
					}
				}
			}
			if(!rollAgain) {
				pt+=pr;
				pr=0;
			}
			else {
				System.out.println("Total: "+pr);
				System.out.println("Enter 1 to roll, 0 to stop");
				if(scn.nextInt()==0) {
					rollAgain = false;
					pt+=pr;
					pr=0;
				}
					
			}
		}
		displayTotals();
	}
	
	public static void computer() {
		System.out.println("Computer turn!");
		boolean rollAgain = true;
		while(rollAgain) {
			rollDice();
			displayRoll();
			if(isSE()) {
				ct = 0;
				cr = 0;
				rollAgain = false;
				break;
			}
			else {
				if(isHSE()) {
					cr = 0;
					rollAgain = false;
					break;
				}
				else {
					if(isDouble10()) { //if both dice have face value of 10, give round total to player
						pt+=cr;
						cr=0;
						break;
					}else {
						if(isDoubles()) { //if both dice have same value double it and add to round total
							cr+=(sumRoll()*2);
						}else {
							cr+=sumRoll();
						}
					}
				}
			}
			if(!rollAgain) {
				ct+=pr;
				cr=0;
			}
			else {
				System.out.println("Total: "+cr);
				if(cr>=20) {
					rollAgain = false;
					ct+=cr;
					cr=0;
				}
					
			}
		}
		displayTotals();
	}

	public static boolean isHSE() {
		return ((die.d1face()==1&die.d2face()!=1)||(die.d1face()!=1&&die.d2face()==1));
	}
	
	public static boolean isSE() {
		return (die.d1face()==1&&die.d2face()==1);
	}
	
	public static void rollDice() {
		die.roll();
	}
	
	public static int sumRoll() {
		return die.sum();
	}
	
	public static boolean isDouble10() {
		return (die.d1face()==10&&die.d2face()==10);
	}
	
	public static boolean isDoubles() {
		return (die.d1face()==die.d2face());
	}
	
	public static void displayRoll() {
		System.out.println(die.d1face()+" , "+die.d2face());
	}
	
	public static void displayTotals() {
		System.out.println("Player total: "+pt+" Computer total: "+ct);
	}
}
