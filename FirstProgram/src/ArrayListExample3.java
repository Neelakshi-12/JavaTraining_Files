
import java.util.*;

public class ArrayListExample3 {
   public static void main(String args[]) {
	   
      ArrayList<String> obj = new ArrayList<String>();

    
      obj.add("Neelu");
      obj.add("jogi");
      obj.add("mani");
      obj.add("chakri");
      obj.add("lucky");

     
      System.out.println("ArrayList:");
      for(String str:obj)
         System.out.println(str);

     //adding elements
      obj.add(0, "devi");
      obj.add(1, "sai");

      // Displaying elements
      System.out.println("\nArrayList : add elements \n");
      for(String str:obj)
         System.out.println(str);

      //Removing elements
      obj.remove("devi"); 
      obj.remove("sai"); 

      // Displaying elements
      System.out.println("\nArrayList : remove elements \n");
      for(String str:obj)
         System.out.println(str);

      //Removing element from particular index
      obj.remove(1); 

      // Displaying elements
      System.out.println("\nFinal ArrayList:");
      for(String str:obj)
         System.out.println(str);
      
      //indexof
      System.out.println("\nIndex Of:");
      int id = obj.indexOf("chakri");
         System.out.println(id);
      
     //lastindexof
     System.out.println("\nlast Index Of:");
     int id2 = obj.lastIndexOf("chakri");
        System.out.println(id2);   
         
      //set
        System.out.println("\nset:");
        obj.set(1, "Shreya");
        for(String str:obj)
            System.out.println(str);
        int numberofitems = obj.size();
        System.out.println("\n numberofitems:"+ numberofitems);
        
        System.out.println("\n array has :"+ obj.contains("Shreya"));
        //sort 
        System.out.println("\n sort");
        
        obj.sort(Comparator.naturalOrder());
        System.out.println("\n array has :"+ obj);
        //clear
     //   obj.clear();
   }
}