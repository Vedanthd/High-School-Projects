package programsUsingDice;

public class Die {

	private int numSides;
	private int faceValue;
	
	Die() {
		numSides = 6;
		roll();
	}
	
	Die(int ns) {
		numSides = ns;
		roll();
	}
	
	public void roll() {
		faceValue = (int)(Math.random()*numSides)+1;
	}
	
	public int getNumSides() {
		return numSides;
	}
	
	public int getFaceValue() {
		return faceValue;
	}
	
	public String toString() {
		return "Number of Sides: " +numSides+ "\nFace Value: " +faceValue;
	}
	
	public boolean equals(Die d) {
		if(this.getFaceValue()==d.getFaceValue()&&this.getNumSides()==d.getNumSides()) {
			return true;
		}
		else {
			return false;
		}
	}
}

	
