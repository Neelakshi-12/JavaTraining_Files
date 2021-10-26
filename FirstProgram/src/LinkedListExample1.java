
import java.util.*;
public class LinkedListExample1 {
     public static void main(String args[]) {

       
       LinkedList<String> linkedlist = new LinkedList<String>();

       /*add list*/
       linkedlist.add("Neelakshi");
       linkedlist.add("Manidhar");
       linkedlist.add("Jogi");
       linkedlist.add("Chakri");
       linkedlist.add("Lucky");

      
       System.out.println("Linked List: " +linkedlist);

    
       linkedlist.addFirst("Shreya");
       linkedlist.addLast("Rochna");
       System.out.println("\nLinkedList after adding Elements:\n" +linkedlist);

       Object updateingList = linkedlist.get(0);
       System.out.println("\nFirst element: " +updateingList);
       linkedlist.set(0, "Shreya Saxena");
       Object updateingList2 = linkedlist.get(0);
       System.out.println("\nFirst element after updating: " +updateingList2);

      
       linkedlist.removeFirst();
       linkedlist.removeLast();
       System.out.println("\nLinkedList after deletion : " +linkedlist);

      
       linkedlist.add(0, "Haripriya");
       linkedlist.remove(2);
       System.out.println("\nFinal Linked List: " +linkedlist); 
     }
}