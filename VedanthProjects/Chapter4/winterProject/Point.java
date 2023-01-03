package winterProject;

import java.text.DecimalFormat;

public class Point {

	static DecimalFormat fmt = new DecimalFormat("0.##");
	private double x;
	private double y;
	
	public Point(){
		x=0;
		y=0;
	}
	
	public Point(double a, double b){
		x=a;
		y=b;
	}
	
	public Point(Rational a, Rational b){
		x = a.decimalValue();
		y = b.decimalValue();
	}
	
	public Point(Point P){
		x = P.getX();
		y = P.getY();
	}
	
	public Point midPoint(Point N){
		double x1 = this.getX(), x2 = N.getX(), y1 = this.getY(), y2 = N.getY();
		double newX = (x1+x2)/2;
		double newY = (y1+y2)/2;
		Point midpoint = new Point(newX,newY);
		return midpoint;
	}
	
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public void setX(double newX){
		x = newX;
	}
	
	public void setY(double newY){
		y = newY;
	}
	
	public void setXY(double newX, double newY){
		x = newX;
		y = newY;
	}
	
	public boolean equals(Point P){
		return (this.getX() == P.getX() && this.getY() == P.getY());
	}
	
	
	public double distanceTo(Point P){
		double distance = Math.sqrt(Math.pow((P.getX()-this.getX()), 2.0)+
										Math.pow((P.getY()-this.getY()), 2.0));
		return distance;
	}
	
	public String toString(){
		return "("+fmt.format(x)+"  ,  "+fmt.format(y)+")";
	}
	
}
