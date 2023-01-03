package point;

public class Rational {
	private int p, q;
	private boolean defined;

	public Rational() {
		p = 1;
		q = 1;
		defined = true;
	}

	public Rational(int n, int d) {
		defined = d == 0 ? false : true;
		if (d < 0 && n >= 0) {
			p = n * -1;
			q = d * -1;
		} else {
			p = n;
			q = d;
		}
	}

	public int getP() {
		return p;
	}

	public int getQ() {
		return q;
	}

	public void setP(int newP) {
		this.p = newP;
	}

	public void setQ(int newQ) {
		if (newQ == 0)
			defined = false;
		else {
			defined = true;
			this.q = newQ;
		}
	}

	public Rational add(Rational r) {
		int nn, nd;
		if (isDefined()) {
			nn = (this.getP() * r.getQ()) + (r.getP() * this.getQ());
			nd = this.getQ() * r.getQ();
			Rational add = new Rational(nn, nd);
			add.reduce();
			return add;
		} else {
			return null;
		}
	}

	public Rational subtract(Rational r) {
		int nn, nd;
		if (isDefined()) {
			nn = (this.getP() * r.getQ()) - (r.getP() * this.getQ());
			nd = this.getQ() * r.getQ();
			Rational sub = new Rational(nn, nd);
			sub.reduce();
			return sub;
		} else {
			return null;
		}
	}

	public Rational multiply(Rational r) {
		int nn, nd;
		if (isDefined()) {
			nn = (this.getP() * r.getP());
			nd = this.getQ() * r.getQ();
			Rational mult = new Rational(nn, nd);
			mult.reduce();
			return mult;
		} else {
			return null;
		}
	}

	public Rational divide(Rational r) {
		int nn, nd;
		if (isDefined()) {
			nn = (this.getP() * r.getQ());
			nd = this.getQ() * r.getP();
			Rational div = new Rational(nn, nd);
			div.reduce();
			return div;
		} else {
			return null;
		}
	}

	public void reduce() {
		int g = gcf(p, q);
		this.setP(p / g);
		this.setQ(q / g);
	}

	public int gcf(int n, int d) {
		for (int i = Math.min(Math.abs(n), Math.abs(d)); i > 1; i--) {
			if (n % i == 0 && d % i == 0)
				return i;
		}
		return 1;
	}

	public boolean equals(Rational r) {
		if (this.getP() == r.getP() && this.getQ() == r.getQ())
			return true;
		return false;
	}

	public double decimalValue() {
		return (double) p / q;
	}

	public boolean isDefined() {
		if(q==0) {
			defined= false;
		}
		else {
			defined= true;
		}
		return defined;
	}
	
	public String toString() {
		return (p + "/" + q);
	}
}