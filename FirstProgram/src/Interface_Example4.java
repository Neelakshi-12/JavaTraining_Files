interface Vehicle {  

void type();  

}  

interface Max_speed extends Vehicle{  

void speed();  

}  

class Interface_Example4 implements Max_speed{  

public void type(){System.out.println("4 or 3 wheeler");}  

public void speed(){System.out.println("60kmph");}  

  

public static void main(String args[]){  

	Interface_Example4 obj = new Interface_Example4();  

obj.type();  

obj.speed();  

 }  

}