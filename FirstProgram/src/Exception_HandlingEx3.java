import java.util.Arrays;
import java.util.Scanner;
public class Exception_HandlingEx3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        
	       
	        try{
	        	System.out.println("Enter the required size of the array :: ");
			    Scanner s = new Scanner(System.in);
			    int size = s.nextInt();
			    int myArray[] = new int[size];
			    
			    
			    System.out.println("Enter the elements of the array one by one ");
			    for (int i = 0; i < size; i++) { // or for (int i = 0; i <= size; i++) {
			      myArray[i] = s.nextInt();
			    }
			    System.out.println("Elements of the array are: " + Arrays.toString(myArray));
			    
			    System.out.println("Enter array index to get Element");
	            int index = sc.nextInt();
	            int element = myArray[index]; 
	            System.out.println("Element "+element+" at index "+index);
	        }
	        catch(Exception e){
	            System.out.println("Trying to access an element beyond size of an array! \n"+e);
	        }

	}

}
