package summerProject;
import java.util.Scanner;
public class CheckSum {

	public static void main(String[] args) {
		//declare variables
		Scanner scn = new Scanner(System.in);
		int input;
		
		//ask user
		System.out.println("Enter the nine digit integer code: ");
		input = scn.nextInt();
		
		//declare more variables
		String isbn = Integer.toString(input);
		int checkZero = input;
		int sum=0;
		
		//find check sum
		  for (int i = 2; i <= 10; i++) {
	            int digit = input%10;                
	            sum += i * digit;
	            input = input / 10;
	        }
		  
		  //output if check sum is 0-9
		  for(int checkSum = 0; checkSum<10; checkSum++) {
			  if((sum+checkSum)%11==0&&checkZero/100000000==0) {
				  System.out.println("Your ISBN number is 0"+isbn+checkSum);
			  }
			  else {
				  if((sum+checkSum)%11==0) {
					  System.out.println("Your ISBN number is "+isbn+checkSum);
				  }
			  }
			  
		  }
		  
		  //output if the check sum is 10
		  if((sum+10)%11==0&&checkZero/100000000==0) {
			  System.out.println("Your ISBN number is 0"+isbn+"X");
		  }
		  else {
			  if((sum+10)%11==0) {
				  System.out.println("Your ISBN number is "+isbn+"X");
			  }
		  }
			
		scn.close();
	}

}
