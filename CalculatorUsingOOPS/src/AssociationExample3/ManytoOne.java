package AssociationExample3;
   

public class ManytoOne {

	public static void main(String[] args) {
		 Person p1 = new Person();
		  p1.setName("Neelakshi");
		 
		Person p2 = new Person();
		 p2.setName("Mani");
		 
		Address a1 = new Address();
		 a1.setState("UP");
		 a1.setCity("Greater Noida");
		 a1.setZip("123524");  
		 
		Address a2 = new Address();
		 a2.setState("UP");
		 a2.setCity("Noida");
		 a2.setZip("123635");  
		 
		  System.out.println(p1.getName()+ " lives at address " +a1.getCity()+ "' " +a1.getState()+ ", " +a1.getZip()+ " but he has also address at " +a2.getCity()+ ", " +a2.getState()+ ", "+a2.getZip());
		  System.out.println(p2.getName()+ " lives at address " +a2.getCity()+ "' " +a2.getState()+ ", " +a2.getZip()+ " but she has also address at " +a1.getCity()+ ", " +a1.getState()+ ", "+a1.getZip());
		 
		  }
}
