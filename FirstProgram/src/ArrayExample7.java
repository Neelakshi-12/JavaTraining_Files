import java.util.Scanner;
import java.util.Arrays;
public class ArrayExample7 {

		  public static void main(String[] args) 
		  {
			  System.out.println("Please enter the length of array?");
			    Scanner scnr = new Scanner(System.in);
			    int length = scnr.nextInt();
			    int[] input = new int[length];
			    
			    System.out.println("Please enter elements of array");
			    for (int i = 0; i < length; i++) {
			      input[i] = scnr.nextInt();
			    }
			    System.out.println("Elements of the Array both are: " + Arrays.toString(input));
			    int sum = 0;
			    sum = sum(input);
			    System.out.println("\n****** SUM ******");
			    System.out.println("Sum of "
			      + length  + " array elements: " + sum);
			    
			     int median=median(length,input);
			     System.out.println("\n****** Median ******");
				 System.out.println("Median : "+median);  
				 System.out.println("\n****** Mode ******");
				 System.out.println("Mode : "+mode(input,length));
		  }

		 
		  static int sum(int[] a) {
		    int sum=0;
		   
		    for(int i=0; i< a.length; i++){
		      System.out.print(a[i]+"\t");
		     
		      sum += a[i];
		    }
		    return sum;
		  }

		  static int median(int length,int input[])
		  {
		  	int m=0;	
		  	
		  	if(length%2==1)
		  	{
		  		m=input[((length+1)/2)-1];
		  		
		  	}
		  	else
		  	{
		  		m=(input[length/2-1]+input[length/2])/2;
		  		
		  	}
		  return m;
		  	
		   }
		  static int mode(int input[],int length) {
		      int maxValue = 0, maxCount = 0, i, j;

		      for (i = 0; i < length; ++i) {
		         int count = 0;
		         for (j = 0; j < length; ++j) {
		            if (input[j] == input[i])
		            ++count;
		         }

		         if (count > maxCount) {
		            maxCount = count;
		            maxValue = input[i];
		         }
		      }
		      return maxValue;
		   }
}
