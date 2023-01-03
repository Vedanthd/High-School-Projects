package programsUsingDice;
import java.util.Scanner;
public class PigGame {
	static PairOfDice die = new PairOfDice();
	static int pt, ct, pr, cr;
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		while(pt<100&&ct<100) {
			player();
			computer();
			if(pt>=100) {
				System.out.println("Player Wins!");
			}
			else {
				if(ct>=100)
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
					pr+=sumRoll();
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
					cr+=sumRoll();
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
	
	public static void displayRoll() {
		System.out.println(die.d1face()+" , "+die.d2face());
	}
	
	public static void displayTotals() {
		System.out.println("Player total: "+pt+" Computer total: "+ct);
	}
}
