
import java.util.Scanner;
import java.util.Arrays;

public class EnjoyRide 
{ 

     static void displayRides(int operator) 
     { 
       System.out.println("*************Displaying Ride Details Per Hour************* \n"); 
    
       
       switch (operator) {
       case '1':
       	 System.out.println("Type of Ride : Alibaba");
       	 
       	 System.out.println("_______________________________________");
    		 System.out.println("Adult Price  "+ "       Child Price");
    		 System.out.println("   $50  "+ "               $40");
    		  System.out.println("_______________________________________\n");
    		  int ap = 50;
    		  int cp = 40;
    		  int sum = 0;
			    sum = sum(ap , cp);
			    System.out.println("\n*****************************");
			   
           break;

       case '2':
    	   System.out.println("Type of Ride : Alpine Slide");
         	 
         	 System.out.println("_______________________________________");
      		 System.out.println("Adult Price  "+ "       Child Price");
      		 System.out.println("   $60  "+ "               $30");
      		  System.out.println("_______________________________________\n");
      		  int ap1 = 60;
    		  int cp1 = 30;
    		  int sum1 = 0;
			    sum1 = sum(ap1 , cp1);
			    System.out.println("\n*****************************");
			   
      		  break;


       case '3':
       	
    	   System.out.println("Type of Ride : Bumpper Cars");
         	 
         	 System.out.println("_______________________________________");
      		 System.out.println("Adult Price  "+ "       Child Price");
      		 System.out.println("   $45  "+ "               $25");
      		  System.out.println("_______________________________________\n");
      		  int ap2 = 45;
    		  int cp2 = 25;
    		  int sum2 = 0;
			    sum2 = sum(ap2 , cp2);
			    System.out.println("\n*****************************");
			   
      		  break;



       case '4':
    	   System.out.println("Type of Ride : Baloon Race");
         	 
         	 System.out.println("_______________________________________");
      		 System.out.println("Adult Price  "+ "       Child Price");
      		 System.out.println("   $70  "+ "               $60");
      		  System.out.println("_______________________________________\n");
      		  int ap3 = 70;
    		  int cp3 = 60;
    		  int sum3 = 0;
			    sum3 = sum(ap3 , cp3);
			    System.out.println("\n*****************************");
			   
      		  break;

       case '5':
    	   System.out.println("Quit");
    	   System.exit(0);
           break; 

       default:
           System.out.println("Choose an continentName To be Displayed!");
           break;
   }
       
       
   } 
     
     
private static int sum(int ap , int cp) {
	 Scanner sc = new Scanner(System.in);
    
    
	 System.out.print("Enter How many adults : ");
	 int adults = sc.nextInt();
	 System.out.print("Enter How many Children : ");
	 int childrens = sc.nextInt();
	 System.out.print("Enter How many Hours : ");
	 int hours = sc.nextInt();
	 System.out.println("\n****** Displaying Results ******");
	 System.out.println("\n Total Number of Hours : " + hours);
	 int arf = ap * adults * hours;
	 System.out.println("\n Adult Ride Fare : $"+arf);
	 int crf = cp * childrens *  hours;
	 System.out.println("\n Child Ride Fare : $"+crf);
	 int ta = arf + crf;
	 System.out.println("\n Total Amount : $"+ta);
	 
		return 0;
	}


public static void main(String[] args) 
{ 
	char operator;
	Scanner input = new Scanner(System.in);
	boolean loopAgain = true;
	do {
    System.out.println("Choose Type of Ride : \n 1.) Alibaba  \n 2.) Alpine Slide \n 3.) Bumpper Cars \n 4.) Baloon Race \n 5.) or Quit-Using\n");
    System.out.println("(enter number between 1-5 to view the ride details)  \n");
     operator = input.next().charAt(0);
     EnjoyRide fd = new EnjoyRide(); 
     EnjoyRide.displayRides(operator); 
   

	} while (loopAgain);
	
	
   } 
 }