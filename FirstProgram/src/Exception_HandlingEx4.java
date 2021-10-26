import java.util.Scanner;

public class Exception_HandlingEx4 {

	public static void main(String[] args) {
		  try {    
			  
		        System.out.println("********** Try Block **********");  
		  
		        Scanner sc = new Scanner(System.in);
			    System.out.println("Enter any Text : ");
			    String input = sc.next();
				     
			        int result = Integer.parseInt(input);  
			        System.out.println(result);  
		      }   
		   
		      catch(Exception e){  
		        System.out.println("Exception handled");  
		        System.out.println(e);  
		      }   
		   
		      finally {  
		        System.out.println("Finally block is always executed");  
		      }    
		  
		      System.out.println("*************");    
		 }    


}
