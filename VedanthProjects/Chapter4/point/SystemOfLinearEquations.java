package point;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SystemOfLinearEquations {
	static Scanner scn = new Scanner(System.in);
	static DecimalFormat fmt = new DecimalFormat("0.##");
	static Line l1, l2;
	static int lineNum;

	public static void main(String[] args) {
		boolean run = true;
		/*
		 * 1. Controls if user wants to enter another system of equations. 2. Allows
		 * user to input both of the equations one by one. 3. Calls the correct
		 * constructor of the line class based upon the value received from the menu()
		 */

		while (run) {
			System.out.println("Please Enter First Line");
			int input = menu();
			lineNum = 1;
			slopeIntercept(input);
			pointSlope(input);
			twoPoints(input);
			standardForm(input);

			System.out.println("Please Enter Second Line");
			input = menu();
			lineNum = 2;
			slopeIntercept(input);
			pointSlope(input);
			twoPoints(input);
			standardForm(input);

			solution();
			System.out.println("_______________________________________________________");

			System.out.println("1. Enter Another Set of Equations\r\n" + "0. Quit");
			int in2 = scn.nextInt();
			if (in2 == 0) {
				run = false;
			}
		}

	}

	public static void solution() {
		/*
		 * This method displays the correct solution for the system of two equations.
		 * This method will handle all the conditions before calling intersection() on
		 * the line class, so that it does not give you null pointer or division by zero
		 * error.
		 * 
		 * NOTE: Here you will check if lines are vertical, horizontal, parallel, etc.
		 */
		double x,y;
		if(l1.isVertical()&& l2.isVertical()) {
			if(l1.getXintercept()==l2.getXintercept()) {
				System.out.println("Consistent System, Infinitely many Solution");

			}else {
				System.out.println("Inconsistent System, No Solution");
	
			}
		} else if(l1.isVertical()||l2.isVertical()){
			if(l1.isVertical()) {
				x=l1.getXintercept();
				y=l2.evaluate(x);
				prtSol(x,y);
			}else {
				x=l2.getXintercept();
				y =l1.evaluate(x);
				prtSol(x,y);
			}			
		} else if(l1.isHorizontal()&&l2.isHorizontal()) {
			if(l1.getYintercept()==l2.getYintercept()) {

			}else {

			}
		}else if(l1.getSlope()==l2.getSlope()) {
			if(l1.getYintercept()==l2.getYintercept()) {
				System.out.println("Consistent, Dependent System, ………");

			}else {
				System.out.println("Inconsistent System, No Solution");

			}
		}else {
			x = (l1.getYintercept()-l2.getYintercept())/(l2.getSlope()-l1.getSlope());
			y = (l2.getSlope()*((l1.getYintercept()-l2.getYintercept())/(l2.getSlope()-l1.getSlope())))+l2.getYintercept();
			prtSol(x,y);
		}
	}

	public static void standardForm(int n) {
		/*
		 * Allows user to input equation in standard form. Function initializes L1 or L2
		 * and displays this equation to the screen
		 */
		if (n == 4) {
			if (lineNum == 1) {
				System.out.println("Enter A:");
				int a = scn.nextInt();
				System.out.println("Enter B:");
				int b = scn.nextInt();
				System.out.println("Enter C:");
				int c = scn.nextInt();
				l1 = new Line(a, b, c);
				System.out.println("Equation 1: " + l1);
			} else {
				if (lineNum == 2) {
					System.out.println("Enter A:");
					int a = scn.nextInt();
					System.out.println("Enter B:");
					int b = scn.nextInt();
					System.out.println("Enter C:");
					int c = scn.nextInt();
					l2 = new Line(a, b, c);
					System.out.println("Equation 2: " + l2);
				}
			}
		}
	}

	public static void twoPoints(int n) {
		/*
		 * Allows user to input equation using two Points. Function initializes L1 or L2
		 * and displays this equation to the screen
		 */
		if (n == 2) {

			if (lineNum == 1) {
				System.out.println("Enter x1:");
				int x1 = scn.nextInt();
				System.out.println("Enter y1:");
				int y1 = scn.nextInt();
				Point p1 = new Point(x1, y1);
				System.out.println("Enter x2:");
				int x2 = scn.nextInt();
				System.out.println("Enter y2:");
				double y2 = scn.nextDouble();
				Point p2 = new Point(x2, y2);
				l1 = new Line(p1, p2);
				System.out.println("Equation 1: " + l1);
			} else {
				if (lineNum == 2) {
					System.out.println("Enter x1:");
					int x1 = scn.nextInt();
					System.out.println("Enter y1:");
					int y1 = scn.nextInt();
					Point p1 = new Point(x1, y1);
					System.out.println("Enter x2:");
					int x2 = scn.nextInt();
					System.out.println("Enter y2:");
					double y2 = scn.nextDouble();
					Point p2 = new Point(x2, y2);
					l2 = new Line(p1, p2);
					System.out.println("Equation 2: " + l2);
				}
			}
		}

	}

	public static void pointSlope(int n) {
		/*
		 * Allows user to input equation using a Points and slope. Function initializes
		 * L1 or L2 and displays this equation to the screen
		 */

		if (n == 3) {
			if (lineNum == 1) {
				System.out.println("Enter the slope:");
				double m = scn.nextDouble();
				System.out.println("Enter the Point");
				System.out.println("x coordinate:");
				int x = scn.nextInt();
				System.out.println("y coordinate:");
				int y = scn.nextInt();
				Point p1 = new Point(x, y);
				l1 = new Line(p1, m);
				System.out.println("Equation 1: " + l1);
			} else {
				if (lineNum == 2) {
					System.out.println("Enter the slope:");
					double m = scn.nextDouble();
					System.out.println("Enter the Point");
					System.out.println("x coordinate:");
					int x = scn.nextInt();
					System.out.println("y coordinate:");
					int y = scn.nextInt();
					Point p1 = new Point(x, y);
					l2 = new Line(p1, m);
					System.out.println("Equation 2: " + l2);
				}
			}
		}
	}

	public static void slopeIntercept(int n) {
		/*
		 * Allows user to input equation using slope and y intercept. Function also
		 * displays this equation to the screen
		 */
		if (n == 1) {

			if (lineNum == 1) {
				System.out.println("Enter the slope:");
				double m = scn.nextDouble();
				System.out.println("Enter the y intercept:");
				int yInt = scn.nextInt();
				l1 = new Line(m, yInt);
				System.out.println("Equation 1: " + l1);
			} else {
				if (lineNum == 2) {
					System.out.println("Enter the slope:");
					double m = scn.nextDouble();
					System.out.println("Enter the y intercept:");
					int yInt = scn.nextInt();
					l2 = new Line(m, yInt);
					System.out.println("Equation 2: " + l2);
				}
			}
		}
	}

	public static void prtSol(double x, double y) {
		prtLn("Solution is: ( " + fmt.format(x) + " , " + fmt.format(y) + " )");
	}

	public static double in() {
		return scn.nextDouble();
	}

	public static void prt(String str) {
		System.out.print(str);
	}

	public static void prtLn(String str) {
		System.out.println(str);
	}

	public static int menu() {
		prtLn("1. Slope and Y-Intercept");
		prtLn("2. Two Points");
		prtLn("3. Point and Slope");
		prtLn("4. Coefficients A, B and C, Standard Form Ax+By=C");
		return scn.nextInt();
	}
}