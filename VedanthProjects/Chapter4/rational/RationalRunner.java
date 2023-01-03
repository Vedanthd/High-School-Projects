package rational;

import point.Rational;

public class RationalRunner {

	public static void main(String[] args) {
		Rational a = new Rational(1,1);
		Rational b = new Rational(2,2);
		System.out.println(a.add(b));
	}

}
