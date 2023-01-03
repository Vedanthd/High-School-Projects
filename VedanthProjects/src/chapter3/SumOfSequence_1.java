package chapter3;

public class SumOfSequence_1 {

	public static void main(String[] args) {
		
		//i
		//initialize sum 
		double sum = 0;
		
		//increase denominator by two each iteration
		for(int i=1; i<=99; i+=2) {
			sum += 1.0/i;
		}
		
		//print answer
		System.out.println(sum);
		
		//ii
		//initialize sum
		sum = 1;
		
		//increase denominator by two each iteration
		for(int i=2; i <=100; i+=2) {
			sum+=1.0/i;
		}
		
		//print answer
		System.out.println(sum);
		
		//iii
		//initialize sum
		sum = 1;
		
		//increase denominator by four each iteration
		for(int i=4; i <=100; i+=4) {
			sum+=1.0/i;
		}
		
		//print answer
		System.out.println(sum);
		
		//iv
		//initialize sum
		sum=0;
		
		//increase numerator by one and make denominator one more than numerator
		for(int i= 1; i<=99; i++) {
			sum+=(double)i/(i+1);
		}
		
		//print answer
		System.out.println(sum);
		
		
	}

}
