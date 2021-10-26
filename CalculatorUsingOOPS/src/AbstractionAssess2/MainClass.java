package AbstractionAssess2;

public class MainClass extends ClassD{


		void showC() {
			System.out.println("This is overridden by D");
		}

		void showB() {
			System.out.println("This is overridden by C");
			
		}

		void showA() {
			
			System.out.println("This is overridden by B");
			
		}
		 
		
		

		public static void main(String[] args) {
			
			MainClass t = new MainClass();
			t.showA();
			t.showB();
			t.showC();
			

		}

		


}
