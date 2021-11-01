
import java.util.*;
class employeeDetails
{
     private String employeid;
     private String empname;
     private int basicsalary=0,HRA,SA,transportallowance,incometax = 2500,netsalary, totaloffers;
     public void read()
     {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the Employee ID : ");//taking all the inputs from the user
        employeid=scan.next();
        System.out.print("Enter the Employee Name : ");
        empname=scan.next();
        System.out.print("Enter the Basic Salary of an Employee : ");
        basicsalary=scan.nextInt();
     
        calculate(basicsalary);
     }
     public void calculate(int basicsalary)  //calculating all the parameters
     { 
    	 //NETSALARY= BASICSALARY+HRA+SPECIALAALLOWANCE+TRANSPORTALLOWANCE-TAX.
    	
      if(basicsalary <= 10000) {
    	  HRA=basicsalary*20/100;
    	
          SA=basicsalary*80/100;
          
          transportallowance = basicsalary*20/100;
        
          int totaloffers = HRA+SA+transportallowance;
          
          netsalary=basicsalary+totaloffers-incometax;
    	  
      }else if(basicsalary >= 10001 && basicsalary <=20000) {
    	  HRA=basicsalary*25/100;
          SA=basicsalary*90/100;
          transportallowance = basicsalary*20/100;
          
          int totaloffers = HRA+SA+transportallowance;
          netsalary=basicsalary+totaloffers-incometax;
      }else {
    	  HRA=basicsalary*30/100;
    	
          SA=basicsalary*95/100;
          transportallowance = basicsalary*20/100;
        
        
          totaloffers = HRA+SA+transportallowance;
          
          netsalary=basicsalary+totaloffers-incometax;
      }
        
     }
     public void display()  //displaying the calculating parameters
     {
    	  System.out.println("\n*****************************");
    	  System.out.println("Employee Details");
    	   System.out.println("NETSALARY= BASICSALARY+HRA+SPECIALAALLOWANCE+TRANSPORTALLOWANCE-TAX.");
    	  System.out.println("*****************************\n");
    	  System.out.println("Employee Id :"+ employeid );
    	  System.out.println("Employee Name :"+ empname );
    	  System.out.println("Employee Basic Salary :"+ basicsalary );
    	  
    	  System.out.println("HRA : "+HRA);
    	  System.out.println("SA : "+SA);
    	  System.out.println("Transport Allowance : "+transportallowance);
    	  System.out.println("Employee Net Salary :"+ netsalary );
    	  System.out.println("*****************************\n");
    	  
     }
 
}
class EmployeeDemo //main function
{
     public static void main(String args[])
     {
    	 boolean loopAgain = true;
    		do {
    	 employeeDetails employeobj=new employeeDetails();
         employeobj.read(); //calling read function
         employeobj.display(); //calling display function
    		}while (loopAgain);
     }
}