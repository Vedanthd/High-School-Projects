package point;

public class UsingPoint {

	public static void main(String[] args) {
		//declare 5 points and distances, using random(5-15 inclusive) method to determine points
		Point A = new Point(random(),random());
		Point B = new Point(random(),random());
		Point C = new Point(random(),random());
		Point D = new Point(random(),random());
		Point E = new Point(random(),random());
		double ab = A.distanceTo(B);
		double ac = A.distanceTo(C);
		double ad = A.distanceTo(D);
		double ae = A.distanceTo(E);
		double bc = B.distanceTo(C);
		double bd = B.distanceTo(D);
		double be = B.distanceTo(E);
		double cd = C.distanceTo(D);
		double ce = C.distanceTo(E);
		double de = D.distanceTo(E);
		
		//create an array that holds the objects Point
		Point[] points = {A,B,C,D,E};
		
		//print each point's coordinates
		for(Point op: points) {
			System.out.println(op);
		}
		
		
		//print the distance between each pair of points
		System.out.println();
	
		System.out.println("Distance between AB is :" + ab);
		System.out.println("Distance between AC is :" + ac);
		System.out.println("Distance between AD is :" + ad);
		System.out.println("Distance between AE is :" + ae);
		System.out.println("Distance between BC is :" + bc);
		System.out.println("Distance between BD is :" + bd);
		System.out.println("Distance between BE is :" + be);
		System.out.println("Distance between CD is :" + cd);
		System.out.println("Distance between CE is :" + ce);
		System.out.println("Distance between DE is :" + de);
		
		//calculate farthest and closest distance
		double maxDistance = 0;
		double minDistance = 20;
		
		//checks distance from each point starting from B with point A
		for(int i = 1; i<points.length; i++) {
			if(points[i].distanceTo(A)>maxDistance) {
				maxDistance = points[i].distanceTo(A);
			}
			if(points[i].distanceTo(A)<minDistance) {
				minDistance = points[i].distanceTo(A);
			}
		}
		
		//checks distance from each point starting from C with point B
		for(int i = 2; i<points.length; i++) {
			if(points[i].distanceTo(B)>maxDistance) {
				maxDistance = points[i].distanceTo(B);
			}
			if(points[i].distanceTo(B)<minDistance) {
				minDistance = points[i].distanceTo(B);
			}
		}
		
		//checks distance from each point starting from D with point C
		for(int i = 3; i<points.length; i++) {
			if(points[i].distanceTo(C)>maxDistance) {
				maxDistance = points[i].distanceTo(C);
			}
			if(points[i].distanceTo(C)<minDistance) {
				minDistance = points[i].distanceTo(C);
			}
		}
		
		//checks distance from each point starting from E with point D
			if(E.distanceTo(D)>maxDistance) {
				maxDistance = E.distanceTo(D);
			}
			if(E.distanceTo(D)>maxDistance) {
				maxDistance = E.distanceTo(D);
			}
		
			//print the farthest pair of points
			System.out.println();

			if(ab>ac && ab>ad && ab>ae && ab>bc && ab>bd && ab>be && ab>cd && ab>ce && ab>de)
				System.out.println("Farthest Points: AB");
			if(ac>ab && ac>ad && ac>ae && ac>bc && ac>bd && ac>be && ac>cd && ac>ce && ac>de)
				System.out.println("Farthest Points: AC");
			if(ad>ab && ad>ac && ad>ae && ad>bc && ad>bd && ad>be && ad>cd && ad>ce && ad>de)
				System.out.println("Farthest Points: AD");
			if(ae>ab && ae>ac && ae>ad && ae>bc && ae>bd && ae>be && ae>cd && ae>ce && ae>de)
				System.out.println("Farthest Points: AE");
			if(bc>ab && bc>ac && bc>ad && bc>ae && bc>bd && bc>be && bc>cd && bc>ce && bc>de)
				System.out.println("Farthest Points: BC");
			if(bd>ab && bd>ac && bd>ad && bd>ae && bd>bc && bd>be && bd>cd && bd>ce && bd>de)
				System.out.println("Farthest Points: BD");
			if(be>ab && be>ac && be>ad && be>ae && be>bc && be>bd && be>cd && be>ce && be>de)
				System.out.println("Farthest Points: BE");
			if(cd>ab && cd>ac && cd>ad && cd>ae && cd>bc && cd>bd && cd>be && cd>ce && cd>de)
				System.out.println("Farthest Points: CD");
			if(ce>ab && ce>ac && ce>ad && ce>ae && ce>bc && ce>bd && ce>be && ce>cd && ce>de)
				System.out.println("Farthest Points: CE");
			if(de>ab && de>ac && de>ad && de>ae && de>bc && de>bd && de>be && de>cd && de>ce)
				System.out.println("Farthest Points: DE");
			
			System.out.println("Farthest Distance: "+maxDistance);
			
			//print the closest pair of points
			System.out.println();

			if(ab<ac && ab<ad && ab<ae && ab<bc && ab<bd && ab<be && ab<cd && ab<ce && ab<de)
				System.out.println("Closest Points: AB");
			if(ac<ab && ac<ad && ac<ae && ac<bc && ac<bd && ac<be && ac<cd && ac<ce && ac<de)
				System.out.println("Closest Points: AC");
			if(ad<ab && ad<ac && ad<ae && ad<bc && ad<bd && ad<be && ad<cd && ad<ce && ad<de)
				System.out.println("Closest Points: AD");
			if(ae<ab && ae<ac && ae<ad && ae<bc && ae<bd && ae<be && ae<cd && ae<ce && ae<de)
				System.out.println("Closest Points: AE");
			if(bc<ab && bc<ac && bc<ad && bc<ae && bc<bd && bc<be && bc<cd && bc<ce && bc<de)
				System.out.println("Closest Points: BC");
			if(bd<ab && bd<ac && bd<ad && bd<ae && bd<bc && bd<be && bd<cd && bd<ce && bd<de)
				System.out.println("Closest Points: BD");
			if(be<ab && be<ac && be<ad && be<ae && be<bc && be<bd && be<cd && be<ce && be<de)
				System.out.println("Closest Points: BE");
			if(cd<ab && cd<ac && cd<ad && cd<ae && cd<bc && cd<bd && cd<be && cd<ce && cd<de)
				System.out.println("Closest Points: CD");
			if(ce<ab && ce<ac && ce<ad && ce<ae && ce<bc && ce<bd && ce<be && ce<cd && ce<de)
				System.out.println("Closest Points: CE");
			if(de<ab && de<ac && de<ad && de<ae && de<bc && de<bd && de<be && de<cd && de<ce)
				System.out.println("Closest Points: DE");
			System.out.println("Closest Distance: "+minDistance);
			
	}
	//generate int between 5 and 20
	public static double random() {
		return (int)(Math.random()*16)+5;
	}
}

