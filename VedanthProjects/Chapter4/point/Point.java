package point;

public class Point {
	private double x;
	private double y;
	
	public Point() { //(0,0) by default
		x=0;
		y=0;
	}
	
	public Point(double a, double b) {
		x=a;
		y=b;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void changeX(double delX) { //add given value to x
		x+=delX;
	}
	
	public void changeY(double delY) { //add given value to y
		y+=delY;
	}
	
	public double distanceTo(Point P) {
		double output = Math.sqrt(Math.pow(getX()-P.getX(), 2)+Math.pow(getY()-P.getY(),2));
		return output;
	}
	
	public boolean equals(Point P) {
		return (Math.abs(getX()-P.getX())<0.01)&&(Math.abs(getY()-P.getY())<0.01);
	}
	
	public String toString() {
		return ("("+getX()+","+getY()+")");
	}
	
}
