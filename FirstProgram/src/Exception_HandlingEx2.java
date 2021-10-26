import java.util.Arrays;
import java.util.Scanner;

public class Exception_HandlingEx2 {

	public static void main(String[] args) {
		try  
        {  
			  System.out.println("Enter the required size of the array :: ");
			    Scanner s = new Scanner(System.in);
			    int size = s.nextInt();
			    int myArray[] = new int[size];
			 
			    System.out.println("Enter the elements of the array one by one ");
			    for (int i = 0; i < size; i++) {
			      myArray[i] = s.nextInt();
			    }
			    System.out.println("Elements of the array are: " + Arrays.toString(myArray));
        }   
        catch(Exception e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  

	}

}
