import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 class TestArray {
 
	ArrayList<Integer> list;
	Scanner scan;
	
	int n;
	
	void getVal() {
		
		list =  new ArrayList<Integer>();
		scan = new Scanner(System.in);
		
		
		System.out.println("\nPlease enter the length of Array? :");
		n = Integer.parseInt(scan.nextLine());
		
		System.out.println("Please enter elements of array :");
		
		for(int i=0; i<n; i++) {
			
			list.add(scan.nextInt());
		}		
	}
	  static int sum(int[] a) {
		    int sum=0;
		   
		    for(int i=0; i< a.length; i++){
		      System.out.print(a[i]+"\t");
		     
		      sum += a[i];
		    }
		    return sum;
		  }
	void display() {
		
		System.out.println("\n*********** Array Elements************");
		System.out.println(list);
		if(list.isEmpty()) {
			
			System.out.println("ArrayList is Empty..");
		}		
		else {
			
			 int sum = 0;
			   
			    System.out.println("\n****** SUM ******");
			    for(int i=0; i< list.size(); i++){
				      System.out.print(list.get(i)+"\t");
				     
				      sum += list.get(i);
				    }
			    System.out.println("\nSUM "+sum); 
			
			  
			 
		}
	}
}
 
public class ArrayListExample2 {
	
	public static void main(String args[]) {
		
		TestArray obj = new TestArray();
		
		obj.getVal();
		obj.display();
	}
}