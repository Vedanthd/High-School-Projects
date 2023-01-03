package point;

public class LineRunner {

	public static void main(String[] args) {

		Line l1 = new Line(2,3);
		Line l2 = new Line(1, 1);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1.intersection(l2));
	}

}

