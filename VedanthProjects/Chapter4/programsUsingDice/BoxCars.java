package programsUsingDice;


public class BoxCars {
	
	public static void main(String[] args) {
		Die d1 = new Die();
		Die d2 = new Die();
		int numRoll = 1000000;
		int boxCars = 0;
		
		for(int i = 0; i<numRoll; i++) {
			d1.roll();
			d2.roll();
			if(d1.equals(d2)&&d1.getFaceValue()==6) {
				boxCars++;
			}
		}
		
		double experimental=((double)boxCars/numRoll)*100.0;
		double theoretical = (1/36.0)*100;
		
		double pError = Math.abs((theoretical-experimental)/theoretical)*100;
		
		System.out.println("Number of total box cars: "+boxCars);
		
		System.out.println("Observed: "+experimental+"%");
		System.out.println("Expected: "+theoretical+"%");
		
		System.out.println("Percent Error: "+pError+"%");

	}
}