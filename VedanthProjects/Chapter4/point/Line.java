package point;

public class Line {

	private double m;
	private double b;
	private double xIntercept;
	private boolean isHorizontal;
	private boolean isVertical;

	// y = x;
	public Line() {
		m = 1;
		b = 0;
		isHorizontal = false;
		isVertical = false;
		xIntercept = 0;
	}

	public Line(double slope, double yInt) {
		isVertical = false;
		m = slope;
		b = yInt;
		xIntercept = -b / m;
		if (m == 0) {
			isHorizontal = true;
		} else {
			isHorizontal = false;
		}
	}

	public Line(Point A, Point B) {
		double x1 = A.getX(), x2 = B.getX(), y1 = A.getY(), y2 = B.getY();

		if (x1 == x2) {
			// the line is vertical
			isVertical = true;
			xIntercept = x1;
			isHorizontal = false;
		} else if (y1 == y2) {
			// the line is horizontal
			isHorizontal = true;
			isVertical = false;
			b = y1;
			m = 0;
		} else {
			// the line has a slope
			m = (y2 - y1) / (x2 - x1);
			isVertical = false;
			isHorizontal = false;
			b = y1 - m * x1;
			xIntercept = -b/m;
		}
	}

	public Line(Point A, double slope) {
		m = slope;
		isVertical = false;
		double x = A.getX();
		double y = A.getY();
		b = y - m * x;
		xIntercept = -b / m;
		if (m == 0) {
			isHorizontal = true;
		} else {
			isHorizontal = false;
		}
	}

	public Line(int A, int B, int C) {
		// non-vertical, non-horizontal line
			m =(double) -A / B;
			b =(double) C / B;
			
			if (B == 0) {
				// undefined line
				xIntercept = (double)C/A;
				isHorizontal = false;
				isVertical = true;
				b=xIntercept;
			} else {
				// vertical line
				isHorizontal = A==0?true:false;
				isVertical = false;
				xIntercept = -b / m;
			}
	
	}

	public boolean isVertical() {
		return isVertical;
	}

	public boolean isHorizontal() {
		return isHorizontal;
	}

	public double getSlope() {
		return m;
	}

	public double getYintercept() {
		return b;
	}

	public double getXintercept() {
		return xIntercept;
	}

	public boolean equals(Line l) {
		return Math.abs(this.getSlope() - l.getSlope()) < .01
				&& Math.abs(this.getYintercept() - l.getYintercept()) < .01;
	}

	public boolean isConsistent(Line l) {
		if (this.isParallel(l) && this.getYintercept() != l.getYintercept()) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isParallel(Line l) {
		return (Math.abs(this.getSlope() - l.getSlope()) < .01);
	}

	public boolean isPerpendicular(Line l) {
		return (Math.abs(this.getSlope() - (-1 / l.getSlope())) < .01);
	}

	public double evaluate(double x) {
		return x * m + b;
	}

	public String toString() {
		return "y = " + m + " x + " + b;
	}
	
	/*
	public Point intersection(Line l2) {
		double x,y;
		//// check if both the lines are vertical and overlapping (x intercepts are same)
		if(this.isVertical() && l2.isVertical() && (this.getXintercept()==l2.getXintercept())) {
			System.out.println("Consistent System, Infinitely many Solution");
			return null;
		}else {
			// check if both lines are vertical and not overlapping(x intercepts are different)
			if(this.isVertical() && l2.isVertical() && (this.getXintercept()!=l2.getXintercept())) {
				System.out.println("Inconsistent System, No Solution");
				return null;
			}else {
				// Computes solution when one of the lines is vertical
				if(this.isVertical() || l2.isVertical()) {
					if(this.isVertical()) {// line 1 vertical
						 x = this.getXintercept();
						 y = l2.evaluate(x);
						 return new Point(x,y);
					}else {
						if(l2.isVertical()) {// line 2 is vertical
							x = l2.getXintercept();
							y = this.evaluate(x);
							return new Point(x,y);
						}
					}
				}else {
					if(!(this.isConsistent(l2))) {
						System.out.println("Inconsistent System, No Solution");
						return null;
					}else {
						if(this.isConsistent(l2)) {
							if(this.getSlope()==(l2.getSlope())){
								System.out.println("Consistent, Dependent System, ………");
								return null;
							}else {
								
							}
						}
					}
					
				}
			}
			//output is needed here
			x = (l2.getYintercept() - this.getYintercept()) / (this.getSlope() - l2.getSlope());
			y = this.getSlope() * x + this.getYintercept();
			return new Point(x, y);
		}
	}
	*/
	public Point intersection(Line l2) {
		double x,y;
		if(this.isVertical()&& l2.isVertical()) {
			if(this.getXintercept()==l2.getXintercept()) {
				System.out.println("Consistent System, Infinitely many Solution");
				return null;
			}else {
				System.out.println("Inconsistent System, No Solution");
				return null;
			}
		} else if(this.isVertical()||l2.isVertical()){
			if(this.isVertical()) {
				x=this.getXintercept();
				y=l2.evaluate(x);
				return new Point(x,y);
			}else {
				x=l2.getXintercept();
				y =this.evaluate(x);
				return new Point(x,y);
			}			
		} else if(this.isHorizontal()&&l2.isHorizontal()) {
			if(this.getYintercept()==l2.getYintercept()) {
				return null;
			}else {
				return null;
			}
		}else if(this.getSlope()==l2.getSlope()) {
			if(this.getYintercept()==l2.getYintercept()) {
				System.out.println("Consistent, Dependent System, ………");
				return null;
			}else {
				System.out.println("Inconsistent System, No Solution");
				return null;
			}
		}else {
			x = (this.getYintercept()-l2.getYintercept())/(l2.getSlope()-this.getSlope());
			y = (l2.getSlope()*((this.getYintercept()-l2.getYintercept())/(l2.getSlope()-this.getSlope())))+l2.getYintercept();
			return new Point(x,y);
		}
		
	}

}