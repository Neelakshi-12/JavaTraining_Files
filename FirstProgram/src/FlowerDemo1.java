import java.util.Map;
import java.util.Scanner;


class DisplayFlowers<K, V> implements Map.Entry<K, V> {
    private final K country_name;
    private V national_flower;

    public DisplayFlowers(K country_name, V national_flower) {
        this.country_name = country_name;
        this.national_flower = national_flower;
    }
    @Override
    public K getKey() {
        return country_name;
    }
    @Override
    public V getValue() {
        return national_flower;
    }
    @Override
    public V setValue(V national_flower) {
        V old = this.national_flower;
        this.national_flower = national_flower;
        return old;
    }
}


public class FlowerDemo1 extends Thread{ 
	
	 static void displayAllFlowers(int operator) 
     { 
       System.out.println("*************Displaying Flowers*************"); 
     
       
       switch (operator) {
       case '1':
         System.out.println("|---------------------------------------|");
        	System.out.println("| Continent Name : ASIA \t\t|");
       	DisplayFlowers<String, String> displayflowers1 = new DisplayFlowers<>("INDIA","LOTUS");
    	DisplayFlowers<String, String> displayflowers2 = new DisplayFlowers<>("PAKISTAN","JASMINE");
    	DisplayFlowers<String, String> displayflowers3 = new DisplayFlowers<>("NEPAL","LALI GURAS");
    	
    	
    	String country_name = displayflowers1.getKey();
        String national_flower = displayflowers1.getValue();
        String country_name1 = displayflowers2.getKey();
        String national_flower1 = displayflowers2.getValue();
        String country_name2 = displayflowers3.getKey();
        String national_flower2 = displayflowers3.getValue();

        System.out.println("|---------------------------------------|");
   	 System.out.println("| Country Name  "+ "   |"+ "   National Flower  |");
   	 System.out.println("|---------------------------------------|");
           System.out.println("| "+country_name+"            |\t"+national_flower +"           |");
           System.out.println("| "+country_name1+"         |\t"+national_flower1+"         |");
           System.out.println("| "+country_name2+"            |\t"+national_flower2+"      |");
           System.out.println("|---------------------------------------|");
           break;

       case '2':
        System.out.println("|---------------------------------------|");
       	System.out.println("| Continent Name : EUROPE \t\t|");
   		
   		DisplayFlowers<String, String> displayflowers11 = new DisplayFlowers<>("GERMANY","CORN FLOWER");
    	DisplayFlowers<String, String> displayflowers22 = new DisplayFlowers<>("FRANCE","LILY");
    	DisplayFlowers<String, String> displayflowers33 = new DisplayFlowers<>("GREECE","ACANTHUS MOLLIS");
    	
    	
    	String country_name00 = displayflowers11.getKey();
        String national_flower00 = displayflowers11.getValue();
        String country_name11 = displayflowers22.getKey();
        String national_flower11 = displayflowers22.getValue();
        String country_name22 = displayflowers33.getKey();
        String national_flower22 = displayflowers33.getValue();
    	 System.out.println("|---------------------------------------|");
    	 System.out.println("| Country Name  "+ "   |"+ "   National Flower  |");
    	 System.out.println("|---------------------------------------|");
            System.out.println("| "+country_name00+"          |\t"+national_flower00 +"     |");
            System.out.println("| "+country_name11+"           |\t"+national_flower11+"            |");
            System.out.println("| "+country_name22+"           |\t"+national_flower22+" |");
            System.out.println("|---------------------------------------|");
        
   	
           break;

       case '3':
    	   System.out.println("|---------------------------------------|");
       	System.out.println("| Continent Name : AFRICA \t\t|");
      	 

   		 
   		DisplayFlowers<String, String> displayflowers111 = new DisplayFlowers<>("EGYPT","BLUE LOTUS");
    	DisplayFlowers<String, String> displayflowers222 = new DisplayFlowers<>("NIGERIA","YELLOW TRUMPET");
    	DisplayFlowers<String, String> displayflowers333 = new DisplayFlowers<>("KENYA","ORCHID");
    	
    	
    	String country_name000 = displayflowers111.getKey();
        String national_flower000 = displayflowers111.getValue();
        String country_name111 = displayflowers222.getKey();
        String national_flower111 = displayflowers222.getValue();
        String country_name222 = displayflowers333.getKey();
        String national_flower222 = displayflowers333.getValue();
        
        
   	 System.out.println("|---------------------------------------|");
	 System.out.println("| Country Name  "+ "   |"+ "   National Flower  |");
	 System.out.println("|---------------------------------------|");
        System.out.println("| "+country_name000+"            |\t"+national_flower000 +"      |");
        System.out.println("| "+country_name111+"          |\t"+national_flower111+"  |");
        System.out.println("| "+country_name222+"            |\t"+national_flower222+"          |");
        System.out.println("|---------------------------------------|");
           break;


       case '4':
           System.out.println("Quit  \n");
           System.exit(0);
           break;

       default:
           System.out.println("Choose an continentName To be Displayed!");
           break;
   }
   } 
	
	
    public static void main(String[] args) {
    	
    	char operator;
    	Scanner input = new Scanner(System.in);
    	boolean loopAgain = true;
    	do {
        System.out.println("Choose an continentName To be Displayed: \n 1.) ASIA  \n 2.) EUROPE \n 3.) AFRICA \n 4.) or Quit-Using\n");
        System.out.println("(enter number between 1-4 to view the data)  \n");
         operator = input.next().charAt(0);
    	 FlowerDemo1 fd = new FlowerDemo1(); 
         FlowerDemo1.displayAllFlowers(operator); 
       

    	} while (loopAgain);
    	
    	
        
      
	
    
    }  
}