package chapter4;
import java.util.Scanner;
public class PigGame {
	 static int d1,d2,pt,ct,pr,cr;
	 static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welsome to Pig");
		System.out.println("The first player to get to a 100 points wins");
		player();
		while(ct<=100&&pt<=100){
			if(pr==0) {
				computer();
			}
			if(cr==0) {
				player();
			}
		}

		
	}
	
	public static void player() {
		System.out.println("Enter 1 to roll or 0 to hold:");
		int input = scn.nextInt();
		
		while(input==1&&!isHSE()) {
			rollDice();
			pr += sumRoll();
			displayRoll();
			if(sumRoll()==0)
				pr=0;
			System.out.println("round: "+pr);
			input = scn.nextInt();
		}
		pt+=pr;
		displayTotals();
		pr = 0;
		
		
	}

	public static void computer() {
		
		while(cr<=20) {
			rollDice();
			cr += sumRoll();
			displayRoll();
			if(sumRoll()==0)
				cr=0;
			System.out.println("round: "+cr);
		}
		ct+=cr;
		displayTotals();
		cr=0;
		
	}
	
	public static boolean isHSE() {
		boolean b = false; 
		if(!(d1==1&&d2==1)&&(d1==1||d2==1)) {
			b = true;
		}
		return b;
	}
	
	public static boolean isSE() {
		boolean b = false; 
		if(d1==1&&d2==1) {
			b = true;
		}
		return b;
	}
	
	public static void rollDice() {
		int dice = (int) (Math.random()*(6)+1);
		d1 = dice;		
		dice = (int) (Math.random()*(6)+1);
		d2 = dice;	
	}
	
	public static int sumRoll() {
		int sum = d1+d2;
		if(isHSE()) {
			sum = 0;
		}
		return sum;
	}
	
	public static void displayRoll() {
		
		System.out.println("("+d1+","+d2+")");
		System.out.println("Sum: "+sumRoll());
	}
	
	public static void displayTotals() {
		System.out.println("Player Total: "+ pt);
		System.out.println("Computer Total: "+ ct);
	}
}
