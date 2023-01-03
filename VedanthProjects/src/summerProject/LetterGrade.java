package summerProject;
import java.util.Scanner;
public class LetterGrade {

	public static void main(String[] args) {
		// Number grade to letter grade
		
		//declare variable
		Scanner scn = new Scanner(System.in);
		int grade;
		
		//ask user
		System.out.println("Enter a number grade:");
		grade = scn.nextInt();
		
		//calculate and print
		if(grade>=90&&grade<=100){
			System.out.println("A");
		}	
		else {
			if(grade>=80&&grade<90) {
				System.out.println("B");
			}
			else {
				if(grade>=70&&grade<80) {
					System.out.println("C");
				}
				else {
					if(grade>=65&&grade<70) {
						System.out.println("D");
					}
					else {
						if(grade<65) {
							System.out.println("F");
						}
					}
				}
			}
		}
	
		scn.close();
		
	}

}
