import java.util.Scanner;

public class ExceptionHandling_ThrowandThrowsEx2 {    
	
    public static void checkNumber(int input) { 
    	
        if(input < 1) {  
            throw new ArithmeticException("exception occured");    
        }  
        else {  
            System.out.println("Number"+ input*input);  
        }  
    }   
    public static void main(String args[]){  
    	    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter any Number : ");
		    int input = sc.nextInt();
            checkNumber(input);  
          
  }    
} 