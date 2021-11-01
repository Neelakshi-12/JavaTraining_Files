
import java.util.Scanner;
import java.util.Arrays;

public class FlowerDemo 
{ 

     static void displayFlowers(int operator) 
     { 
       System.out.println("*************Displaying Flowers*************"); 
     
       
       switch (operator) {
       case '1':
       	 System.out.println("Continent Name : ASIA");
       	 
       	 System.out.println("_______________________________________");
    		 System.out.println("   Country Name.  "+ "      National Flower");
    		 System.out.println("_______________________________________");
    		 System.out.println("   INDIA  "+ "               LOTUS");
    		 System.out.println("   PAKISTAN.  "+ "           JASMINE");
    		 System.out.println("   NEPAL.  "+ "              LALI GURAS");
    		 System.out.println("_______________________________________\n");
           break;

       case '2':
       	System.out.println("Continent Name : EUROPE");
      	 
       	 System.out.println("_______________________________________");
   		 System.out.println("   Country Name.  "+ "      National Flower");
   		 System.out.println("_______________________________________");
   		 System.out.println("   GERMANY  "+ "               CORN FLOWER");
   		 System.out.println("   FRANCE.  "+ "               LILY");
   		 System.out.println("   GREECE.  "+ "              ACANTHUS MOLLIS");
   		System.out.println("_______________________________________\n");
           break;

       case '3':
       	
       	System.out.println("Continent Name : AFRICA");
      	 
       	 System.out.println("_______________________________________");
   		 System.out.println("   Country Name.  "+ "      National Flower");
   		 System.out.println("_______________________________________");
   		 System.out.println("   EGYPT  "+ "               BLUE LOTUS");
   		 System.out.println("   NIGERIA.  "+ "           YELLOW TRUMPET");
   		 System.out.println("   KENYA.  "+ "              ORCHID");
   		 System.out.println("_______________________________________\n");
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
public static void main(String[] args) 
{ 
	char operator;
	Scanner input = new Scanner(System.in);
	boolean loopAgain = true;
	do {
    System.out.println("Choose an continentName To be Displayed: \n 1.) ASIA  \n 2.) EUROPE \n 3.) AFRICA \n 4.) or Quit-Using\n");
    System.out.println("(enter number between 1-4 to view the data)  \n");
     operator = input.next().charAt(0);
	 FlowerDemo fd = new FlowerDemo(); 
     FlowerDemo.displayFlowers(operator); 
   

	} while (loopAgain);
	
	
   } 
 }