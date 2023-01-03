package chapter3;

public class sum100 {

	public static void main(String[] args) {
		// Write a method called sum100 that returns the sum of the integers from 1 to 100, inclusive.
		
		int sum =0;
		
		for(int i =1; i<=100; i++) {
			sum+=i;
			System.out.println(sum);
		}

	}

}
