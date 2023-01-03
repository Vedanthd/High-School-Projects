package chapter4;
import java.util.Scanner;
public class PalindromeTester {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s;
		System.out.println("Enter string to check if it a palindrome:");
		s = scn.nextLine();
		boolean b = isPalendrome(s);	
		System.out.println(b);
	}
	
	public static boolean isPalendrome (String s) {
		String ls = lower(s);
		String nps = removePuncuation(ls);
		String reverse = reverse(nps);
		boolean op = reverse.equals(nps); 
		return op;
	}
	
	public static String lower (String s) {
		String op = s.toLowerCase();
		return op;
	}
	
	public static String removePuncuation (String s) {
		String op = "";
		char alpha;
		for(int i=0; i<s.length(); i++) {
			alpha = s.charAt(i);
			if((alpha>='a'&& alpha<='z')||(alpha>='A'&& alpha<='Z')) {
				op+=alpha;
			}
		}
		return op;
	}
	
	public static String reverse (String s) {
		String op = "";
		for(int i = s.length()-1; i>=0; i--) {
			op+=s.charAt(i);
		}
		return op;
	}

}
