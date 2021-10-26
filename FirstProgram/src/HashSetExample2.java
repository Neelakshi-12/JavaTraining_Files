

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] argv) throws Exception
	{

			
			Set<Integer> set1 = new HashSet<Integer>();

			set1.add(6);
			set1.add(3);
			set1.add(7);
			set1.add(2);
			set1.add(9);

			System.out.println("First Set Elements : "
							+ set1);

			Set<Integer> set2 = new HashSet<Integer>();
			set2.add(6);
			set2.add(3);
			set2.add(9);
			set2.add(1);
			set2.add(5);

			System.out.println("Second Set Elements: "
							+ set2);

			System.out.println("\n************ retainAll() ************");
			set2.retainAll(set2);

			System.out.println("retainAll() : "
							+ set2);
			System.out.println("\n************ addAll() ************");
	        set1.addAll(set2);
	  
	        System.out.println("addAll() : " + set1);
	    	System.out.println("\n************ removeAll() ************");
	        set1.removeAll(set2);
	        
            System.out.println("removeAll() : "
                               + set1);
		
	}
}
