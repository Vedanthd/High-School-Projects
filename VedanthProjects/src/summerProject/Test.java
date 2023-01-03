package summerProject;
import java.util.Scanner;
public class Test {

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int x =0;
		for(int j=0; j<100; j++) {
			for(int k=100; k>0; k--) {
				x++;
			}
		}
		System.out.println(x);
		
	}
}
