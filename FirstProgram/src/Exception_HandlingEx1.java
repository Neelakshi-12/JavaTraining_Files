import java.util.Scanner;
public class Exception_HandlingEx1 {

	public static void main(String[] args) {
	   try {
		   Scanner sc = new Scanner(System.in);
		    System.out.println("Enter any Text : ");
		    String input = sc.next();
			     
		        int result = Integer.parseInt(input);  
		        System.out.println(result);  
	   }catch(Exception e) {
		    System.out.println(e);  
	   }

	}

}
