
import java.util.Scanner;

class MethodMain{  
	 void division(int input1, int input2) throws ArithmeticException{  
	  System.out.println("Method Called");  
	       int result;
	       result = input1/input2;
	       System.out.println("Result : "+ result);
	 }  
	}  
	public class ExceptionHandling_ThrowandThrowsEx3 {    
	 
	    public static void main(String args[]){  
	    	  Scanner sc = new Scanner(System.in);
			    System.out.println("Enter first Number : ");
			    int input1 = sc.nextInt();
			    System.out.println("Enter Second Number : ");
			    int input2 = sc.nextInt();
			    
			    try {
			    	MethodMain m=new MethodMain();  
			         m.division(input1 , input2);  
			     }
			     catch (ArithmeticException e) {
			         System.out.println("Exception."+ e);
			     }
	  }    
	} 