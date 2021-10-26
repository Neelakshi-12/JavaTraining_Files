package ArrayListExamples;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class MainCar {

	public static void main(String[] args) {
		
		CarFeatures s1=new CarFeatures(1,"white",23,"Maruti Suzuki.");  
		CarFeatures s2=new CarFeatures(2,"red",21,"Hyundai India");  
		CarFeatures s3=new CarFeatures(3,"black",25,"Tata Motors.");  
		  
		  ArrayList<CarFeatures> al=new ArrayList<CarFeatures>();  
		  al.add(s1);
		  al.add(s2);  
		  al.add(s3);  
		 
		  Iterator itr=al.iterator();  
	 
		  while(itr.hasNext()){  
			  CarFeatures st=(CarFeatures)itr.next();  
		    System.out.println(st.carno+" "+st.color+" "+st.model+ " "+st.company);  
		  }  

	}

}
