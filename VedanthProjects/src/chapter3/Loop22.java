package chapter3;

public class Loop22 {

	public static void main(String[] args) {
		// Print the numbers between LOW and HIGH that are evenly divisible by four but not by five
		
		final int HIGH = 250;
		final int LOW = 10;
		
		for(int i = LOW; i<=HIGH; i++) {
			if(i%4==0&&i%5!=0) {
				System.out.println(i);
			}
		}
		
	}

}
