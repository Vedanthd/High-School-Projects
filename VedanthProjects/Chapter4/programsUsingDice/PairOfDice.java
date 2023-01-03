package programsUsingDice;

public class PairOfDice {

	private Die d1;
	private Die d2;
	private int d1Face;
	private int d2Face;
	
	PairOfDice() {
		d1 = new Die();
		d2 = new Die();
		roll();
	}
	
	PairOfDice(int ns) {
		d1 = new Die(ns);
		d2 = new Die(ns);
		roll();
	}
	
	PairOfDice(int ns, int ns2) {
		d1 = new Die(ns);
		d2 = new Die(ns2);
		roll();
		
	}
	
	public void roll() {
		d1.roll();
		d2.roll();
		d1Face = d1.getFaceValue();
		d2Face = d2.getFaceValue();
	}
	
	public int d1face() {
		return d1.getFaceValue();
	}
	
	public int d2face() {
		return d2.getFaceValue();
	}
	
	public int sum() {
		return d1Face+d2Face;
	}
}
