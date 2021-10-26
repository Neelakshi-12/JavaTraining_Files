import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 class TestArray2 {
 
	ArrayList<String> list;
	Scanner scan;
	
	int n;
	
	void getVal() {
		
		list =  new ArrayList<String>();
		scan = new Scanner(System.in);
		
		
		System.out.println("\nPlease enter the length of Array? :");
		n = Integer.parseInt(scan.nextLine());
		
		System.out.println("Please enter elements of array :");
		
		for(int i=0; i<n; i++) {
			String answer = scan.nextLine();
			list.add(answer);
		}		
	}
	
	void display() {
		
		System.out.println("\n*********** Array Elements************");
		
		if(list.isEmpty()) {
			
			System.out.println("ArrayList is Empty..");
		}		
		else {
			
			for(int i=0; i<list.size(); i++) {
				
				System.out.println(list.get(i));
			}
			System.out.println(list);
		}
	}
}
 
public class ArrayListExample4 {
	
	public static void main(String args[]) {
		
		TestArray2 obj = new TestArray2();
		
		obj.getVal();
		obj.display();
	}
}