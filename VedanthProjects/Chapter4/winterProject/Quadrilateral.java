package winterProject;


/*STUDENT VERSION DO NOT EDIT*/


public class Quadrilateral {
	/*Points are created in clockwise order such that:
	 * A is top left
	 * B is top right
	 * C is bottom right
	 * D is bottom left
	 */
	private Point A;
	private Point B;
	private Point C;
	private Point D;
	private String type;
	
	//default constructor
	public Quadrilateral(){
		genA();
		genB();
		genC();
		genD();
		type = classify();
		// assign value to type using classify method
	}
	
	public Quadrilateral(Point A1, Point B1, Point C1, Point D1){
		A = A1;
		B = B1;
		C = C1;
		D = D1;
		type = classify();
		// assign value to type using classify method
	}
	
	// overloaded constructor
	/*Creates a quadrilateral based upon the String type passed as a 
	 * parameter. type: Parallelogram, Rhombus, Rectangle, Square and Trapezoid
	 * EXTRA CREDIT: kite
	 * Use classify method to initialize type. 
	 */
	public Quadrilateral(String str){
		type = str;
		if(str.equalsIgnoreCase("Square")) {
			initSquare();
		}
	}
	
	private void initSquare() {
		genA();
		genB();
		Line AB = new Line(A,B);
		double pSlope = AB.getSlope()*-1.0;
	}

	//random point with x ->[0-100], y->[0,100], x and y are multiples of 10
	private void genA(){
		int x = (int)(Math.random()*11)*10;
		int y = (int)(Math.random()*11)*10;
		A = new Point(x, y);
	}
	
	//random point with x ->[100-200], y->[0,100], x and y are multiples of 10
	private void genB(){
		int x = (int)(Math.random()*10)*10 + 110;
		int y = (int)(Math.random()*11)*10;
		B = new Point(x, y);
	}
	
	//random point with x ->[100-200], y->[100,200], x and y are multiples of 10
	private void genC(){
		int x = (int)(Math.random()*10)*10 + 110;
		int y = (int)(Math.random()*10)*10 + 110;
		C = new Point(x, y);
	}
	
	//random point with x ->[0-100], y->[100,200], x and y are multiples of 10
	private void genD(){
		int x = (int)(Math.random()*11)*10;
		int y = (int)(Math.random()*10)*10 + 110;
		D = new Point(x, y);
	}
	
	public Point getA(){
		return A;
	}
	
	public Point getB(){
		return B;
	}
	
	public Point getC(){
		return C;
	}
	
	public Point getD(){
		return D;
	}
	
	public double sideAngle() {
		
		return 0;
	}
	
	
	/* returns true or false based upon if quadrilateral is a parallelogram 
	 * with all equal side and all equal angles. 
	 */
	public boolean isSquare(){
		
		if( sideLength(A,B)==sideLength(B,C)&&sideLength(B,C)==sideLength(C,D)&&sideLength(C,D)==sideLength(D,A) //all sides are equal length
				&&isRectangle()){
			return true;
		}
		return false;
	}
	
	/* returns true or false based upon if quadrilateral is a 
	 * parallelogram. There are many sufficient conditions to prove that
	 * shape is a parallelogram. You can decide to choose any you like. 
	 */
	public boolean isParallelogram(){
		Line AB = new Line(A,B);
		Line BC = new Line(B,C);
		Line CD = new Line(C,D);
		Line DA = new Line(D,A);
		
		if(A.midPoint(C).equals(D.midPoint(B)) //midpoints of diagonals are same
				&& sideLength(A,B)==sideLength(D,C) && sideLength(D,A)==sideLength(C,D) //opposite sides equal length
				&& AB.isParallel(CD) && BC.isParallel(DA)) { //opposite sides parallel
			return true;
		}
		
		return false;
	}
	
	private boolean isTrapezoid() {
		Line AB = new Line(A,B);
		Line BC = new Line(B,C);
		Line CD = new Line(C,D);
		Line DA = new Line(D,A);
		
		
		if( AB.isParallel(CD) && !BC.isParallel(DA) || !AB.isParallel(CD) && BC.isParallel(DA) //only one pair of parallel lines
				) {
			return true;
		}
			
		return false;
	}
	
	/* returns true or false based upon if quadrilateral 
	 * is a quadrilaeral with all 90 degree angles
	 */
	public boolean isRectangle(){

		
		if(isParallelogram()
				&&sideLength(A,C)==sideLength(B,D)) { //angles are all 90 degrees
			return true;
		}
		
		return false;
	}
	
	/* returns true or false based upon if quadrilateral
	 * is a parallelogram with all equal sides
	 */
	public boolean isRhombus(){

		if( sideLength(A,B)==sideLength(B,C)&&sideLength(B,C)==sideLength(B,D)&&sideLength(C,D)==sideLength(D,A) //all sides are equal length
				
				&& isParallelogram()) { //diagonals are perpendicular 
			return true;
		}
		
		return false;
	}
	
	/* returns true of false based upon if quadrilateral 
	 * has congruent consecutive sides. 
	 */
	public boolean isKite(){
		
		return true;
	}
	
	
	/* returns area of the quadrilateral, in order to do this
	 * you may want to check this link: 
	 * https://www.youtube.com/watch?v=JVZud7ZBEKg
	 * OR You may want to use Heron's Formula, in this case
	 * you will treat quadrilateral as two triangles and find length
	 * of the diagonal. 
	 */
	public double area(){
		double diagonal = sideLength(B,D);
		double s1 = diagonal + sideLength(B,C)+sideLength(C,D);
		double area1 = Math.sqrt(s1*(s1-sideLength(B,C))*(s1-sideLength(C,D))*(s1-diagonal));
		double s2 = diagonal + sideLength(A,B)+sideLength(A,D);
		double area2 = Math.sqrt(s2*(s2-sideLength(B,A))*(s2-sideLength(A,D))*(s2-diagonal));
		return area1+area2;
	}
	
	//returns perimeter of a quadrilateral
	public double perimeter(){
		return sideLength(A,B)+sideLength(B,C)+sideLength(C,D)+sideLength(D,A);
	}
	
	
	// returns slope of the line formed by points L and N
	public Rational sideSlope(Point L, Point N){
		Rational r = new Rational(); // you will need to change this declaration
		Line ln = new Line(L,N);
		r = new Rational(ln.getSlope());
		return r;
	}
	
	// returns length of the line with end points in parameter
	public double sideLength(Point L, Point N){
		double len=0;
		len = L.distanceTo(N);
		
		return len;
	}
	
	
	/*Classify quadrilateral as parallelogram, rectangle, rhombus, 
	 * square or trapezoid. write code below for this method
	 */
	private String classify(){
		String result="";
		
		if(isParallelogram()) {
			result+="PARALLELOGRAM \n";
		}
		
		if (isRectangle()) {
			 result+="RECTANGLE \n";
		}
		
		if(isSquare()) {
			result+="SQUARE \n";
		}
		if(isRhombus()) {
			 result+="RHOMBUS \n";
		}

		if(isTrapezoid()) {
			 result+="TRAPEZOID \n";
		}

		return result;
	}

	public String getType(){
		return type;
	}
	
	
	/*should return coordinates of 4 corners
	 * Area: 
	 * Perimeter:
	 * Type:
	 */
	public String toString(){
		return "A: " + A +"\t\tB: " + B + "\nC: " + C +"\tD: " + D+"\nArea: "+this.area()+"\nPerimeter: "+this.perimeter()+"\nType:"+type;
	}
	
}
