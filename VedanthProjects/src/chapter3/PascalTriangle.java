package chapter3;
import java.util.Scanner;
public class PascalTriangle {
	
	 public static void main(String[] args) {
		 //declare variables
 	    Scanner scn = new Scanner(System.in);
 	    int num = 1;
 	    
 	    //ask user
	    System.out.print("Enter the number of lines: ");
	    int lines = scn.nextInt();
	 
	    //calculate and print
	    for(int i = 0; i<lines; i++){
	      
	      for(int j = 0; j<lines-i; j++){
	        System.out.print(" ");
	      }
	      for(int j = 0; j<=i; j++){
	        if(j==0 || i==j) {
	          num = 1;
	        }
	        else {
	          num=num*(i-j+1)/j;
	        }
	        System.out.print(num+" ");
	      }
	      System.out.println();
	    }
	 
	    scn.close();

	  }
	}

