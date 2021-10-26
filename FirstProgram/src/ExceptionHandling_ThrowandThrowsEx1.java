
import java.io.*;
import java.util.Scanner;  
class Method{  
 void checkNumber() throws ArithmeticException{  
  System.out.println("Method Called");  
        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any Number : ");
	    int input = sc.nextInt();
      
	      if(input > 1) {
	    	  System.out.println("Here : "+ input*input);
	      }else {
	    	  System.out.println("else block ");
	    	  throw new ArithmeticException();
	      }
  }  
}  
class ExceptionHandling_ThrowandThrowsEx1{  
   public static void main(String args[])throws ArithmeticException{  
    
     
     try {
    	 Method m=new Method();  
         m.checkNumber();  
     }
     catch (ArithmeticException e) {
         System.out.println("Exception."+ e);
     }
  
    System.out.println("normal flow...");  
  }  
}  