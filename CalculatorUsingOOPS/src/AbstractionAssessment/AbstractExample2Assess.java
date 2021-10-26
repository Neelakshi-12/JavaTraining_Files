package AbstractionAssessment;



abstract class Name {
    protected final String name;
    public Name(String name) {
        this.name = name;
    }
    public abstract boolean start();
}
class WelcomeText extends Name {
    public WelcomeText(String name) {
        super(name);
    }
    public boolean start() {
        System.out.println("Hii I am "+ this.name + " , Welcome!!");
        return true;
    }
}



class AbstractExample2Assess {

 public static void main(String args[]){
	 Name name = new WelcomeText("Neelakshi");
     name.start();
     
	
 }
}