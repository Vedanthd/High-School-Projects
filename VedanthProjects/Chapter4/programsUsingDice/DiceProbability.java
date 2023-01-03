package programsUsingDice;

public class DiceProbability {
	static Die d1 = new Die();
	static Die d2 = new Die();
	static Die d3 = new Die();
	static Die d4 = new Die();
	static Die d5 = new Die();
	static Die d6 = new Die();
	
	public static void main(String[] args) {
		
		int numRoll = 100000;
		System.out.println("Number of Rolls: "+numRoll);
		System.out.println();
		
		//sum of 15
		int sumOf15 = 0;
		
		for(int i = 0; i<numRoll; i++) {
			roll();
			if(sum()==15) {
				sumOf15++;
			}
		}
		
		System.out.println("Sum of 15 Count: "+sumOf15);	
		System.out.println("Observed Probability: "+observed(sumOf15,numRoll)+"%");		
		System.out.println();
		
		//sum between 5-10
		int sum5to10 = 0;
		
		for(int i = 0; i<numRoll; i++) {
			roll();
			int sum = sum();
			if(sum>=5&&sum<=10) {
				sum5to10++;
			}
		}
		
		System.out.println("Sum between 5-10 Count: "+sum5to10);	
		System.out.println("Observed Probability: "+observed(sum5to10,numRoll)+"%");		
		System.out.println();
		
		//sum of 20
		int sumOf20 = 0;
		
		for(int i = 0; i<numRoll; i++) {
			roll();
			if(sum()==20) {
				sumOf20++;
			}
		}
		
		System.out.println("Sum of 20 Count: "+sumOf20);	
		System.out.println("Observed Probability: "+observed(sumOf20,numRoll)+"%");		
		System.out.println();
		
		//sum between 5-10
				int sum15to25 = 0;
				
				for(int i = 0; i<numRoll; i++) {
					roll();
					int sum = sum();
					if(sum>=15&&sum<=25) {
						sum15to25++;
					}
				}
				
				System.out.println("Sum between 15-25 Count: "+sum15to25);	
				System.out.println("Observed Probability: "+observed(sum15to25,numRoll)+"%");		
				System.out.println();
					
	}
	     
	public static double observed(int a, int b) {
		return ((double)a/b)*100.0;
	}
	
	public static void roll() {
		d1.roll();
		d2.roll();
		d3.roll();
		d4.roll();
		d5.roll();
		d6.roll();
	}
	
	public static int sum() {
	return d1.getFaceValue()+d2.getFaceValue()+d3.getFaceValue()+d4.getFaceValue()+d5.getFaceValue()+d6.getFaceValue();
	}
}
