import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class HashSetExample1 {

	public static void main(String[] args) {
		   System.out.println("\n******For Strings******\n");
	    HashSet<String> names = new HashSet<String>();
	    names.add("Neelu");
	    names.add("Mani");
	    names.add("Chakri");
	    names.add("Jogi");
	    names.add("lucky");
	    System.out.println(names);
	    System.out.println("\n******For Integers******\n");
		Set<Integer> ids = new HashSet<>();
		ids.add(14);
		ids.add(20);
		ids.add(50);
		ids.add(10);
		System.out.println("Before Sorting : "+ids);
		ids = new TreeSet<>(ids);
		System.out.println("After Sorting : "+ids);
	  }

}

