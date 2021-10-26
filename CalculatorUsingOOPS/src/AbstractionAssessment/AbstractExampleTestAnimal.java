package AbstractionAssessment;

abstract class Animal{  

	Animal(){System.out.println("All Animals Sleep");
	}  

 abstract void run();  

 void animalColor(){System.out.println("Color is Black");}  
 void animalSound(){System.out.println("Bow-Bow");}  
 void animalEating() {System.out.println("Biscuits");}
}  
 

class Dog extends Animal{  

void run(){
	System.out.println("It has 4 legs");
	}  

}  

public class AbstractExampleTestAnimal {

	public static void main(String[] args) {
		Animal obj = new Dog();  

		  obj.run();  

		  obj.animalColor();
		  obj.animalSound();
		  obj.animalEating();

	}

}
