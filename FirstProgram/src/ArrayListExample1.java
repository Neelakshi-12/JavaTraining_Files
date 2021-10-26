
import java.util.*;  
public class ArrayListExample1{  
  public static void main(String args[]){  
     ArrayList<String> list=new ArrayList<String>();  
     list.add("Neelakshi");  
     list.add("Mani");  
     list.add("Abhii");  
     list.add("Devi"); 
     list.add("Venky");
  
    
     for(String str:list)  
        System.out.println(str);  
     }  
}