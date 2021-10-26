interface MainStudent {  

void majorSubject();  
void netQualified();  

}  

interface Teacher extends MainStudent{  
	void department();  
	void salary();  


}  

class Interface_Example3 implements Teacher{  

public void majorSubject(){System.out.println("Major Subject");}  

public void netQualified(){System.out.println("Net Qualified");}  
public void department(){System.out.println("Department");}  

public void salary(){System.out.println("Salary");} 

  

public static void main(String args[]){  

	Interface_Example3 obj = new Interface_Example3();  

obj.majorSubject();  

obj.netQualified();  
obj.department();  

obj.salary();  

 }  

}