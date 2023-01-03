package chapter4;
import java.util.Scanner;
public class RationalOperations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int p1, q1, p2, q2, choice;
		System.out.println("Input first rational number");
		System.out.println("Numerator:");
		p1 = scn.nextInt();
		System.out.println("Denominator:");
		q1 = scn.nextInt();
		System.out.println("Input second rational number:");
		System.out.println("Numerator:");
		p2 = scn.nextInt();
		System.out.println("Denominator:");
		q2 = scn.nextInt();
		choice = menu();
		
		while(choice!=0) {
			if(choice==1) {
				add(p1,q1,p2,q2);
			}else if(choice==2) {
				subtract(p1,q1,p2,q2);
			}else if(choice==3) {
				multiply(p1,q1,p2,q2);
			}else if(choice==4) {
				divide(p1,q1,p2,q2);
			}
			choice = menu();
		}
		
		scn.close();
	}
	
	public static int menu() {
		Scanner scn = new Scanner(System.in);
		int selection = 0;
		System.out.println("1 to add");
		System.out.println("2 to subtract");
		System.out.println("3 to multiply");
		System.out.println("4 to division");
		System.out.println("0 to quit");
		return selection = scn.nextInt();
	}
	
	public static int gcf(int a, int b) {
		for(int i =Math.min(Math.abs(a), Math.abs(b)); i>1; i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		return 1;
	}

	public static void add(int p1, int q1, int p2, int q2) {
		int nn = p1*q2+p2*q1;
		int nd = q1*q2;
		int g = gcf(nn,nd);
		nn = nn/g;
		nd = nd/g;
		System.out.println("Sum "+nn+"/"+nd);
	}
	
	public static void subtract(int p1, int q1, int p2, int q2) {
		int nn = p1*q2-p2*q1;
		int nd = q1*q2;
		int g = gcf(nn,nd);
		nn = nn/g;
		nd = nd/g;
		System.out.println("Difference "+nn+"/"+nd);
	}
	
	public static void multiply(int p1, int q1, int p2, int q2) {
		int nn = p1*p2;;
		int nd = q1*q2;
		int g = gcf(nn,nd);
		nn = nn/g;
		nd = nd/g;
		System.out.println("Product "+nn+"/"+nd);
	}
	
	public static void divide(int p1, int q1, int p2, int q2) {
		int nn = p1*q2;
		int nd = q1*p2;
		int g = gcf(nn,nd);
		nn = nn/g;
		nd = nd/g;
		System.out.println("Sum "+nn+"/"+nd);
	}
}
