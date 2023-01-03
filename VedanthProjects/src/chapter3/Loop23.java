package chapter3;

public class Loop23 {

	public static void main(String[] args) {
		// Print all factors of a value stored in the variable number. Assume the value is positive
		
		int number = 50;
		
		for(int i =1; i<=number; i++) {
			if(number%i==0) {
				System.out.println(i);
			}
		}
	}

}
