interface Interface1{  

void shape();  

}  

interface Interface2 extends Interface1{  

void shape3d();  

}  

class Interface_Example1 implements Interface2{  

public void shape(){System.out.println("shape");}  

public void shape3d(){System.out.println("shape3d");}  

  

public static void main(String args[]){  

	Interface_Example1 obj = new Interface_Example1();  

obj.shape();  

obj.shape3d();  

 }  

}