
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class HashMapExample2 {

   public static void main(String args[]) {

    
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

      hmap.put(1, "Neelakshi");
      hmap.put(2, "Mani");
      hmap.put(7, "jogi");
      hmap.put(4, "Chakri");
      hmap.put(3, "Lucky");

      Set set = hmap.entrySet();
      Iterator iterator = set.iterator();
      System.out.println("-------------------------");
      System.out.println("Roll No." + "           "+"Names");
      System.out.println("-------------------------");
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.println( mentry.getKey()+ "                 "+mentry.getValue());
         
      }
      System.out.println("-------------------------");
      String var= hmap.get(2);
      System.out.println("Value at index 2 is: "+var);
      System.out.println("-------------------------");
      hmap.remove(3);
      System.out.println("After removing Element:");
      Set set2 = hmap.entrySet();
      Iterator iterator2 = set2.iterator();
      System.out.println("-------------------------");
      System.out.println("Roll No." + "           "+"Names");
      System.out.println("-------------------------");
      while(iterator2.hasNext()) {
          Map.Entry mentry2 = (Map.Entry)iterator2.next();
          System.out.println( mentry2.getKey()+ "                 "+mentry2.getValue());
       }
      System.out.println("-------------------------");
   }
}