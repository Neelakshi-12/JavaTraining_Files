

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample1 {

	public static void main(String[] args) throws InterruptedException {

		
		HashMap<Integer, String> bestPlace = new HashMap<>();
		boolean loopAgain = true;
		Scanner scan = new Scanner(System.in);

	
		do {
			
			System.out.print("Enter Sno. :");
			Integer sno = Integer.parseInt(scan.nextLine());

		
			System.out.print("Enter Place:");
			String place = scan.nextLine();

		

			String oldVal = bestPlace.put(sno, place);

			if (oldVal!=null) {
				System.out.println("Place Sr. Number:" + sno + " is "
						+ oldVal + " and has been overwritten by " + place);
			}

		
			System.out.print("Enter another Place to Visit (y/n)?");
			String answer = scan.nextLine();

			
			if (answer.equals("y") || answer.equals("Y")) {
				continue;
			} else {
				break;
			}

		} while (loopAgain);
		scan.close();

		System.out.println("\n**********************************");
		System.out.println("************Best Places***********");
		System.out.println("   Sr. No.  "+ "      Place");		
		for(int id:bestPlace.keySet()){
			System.out.println("   "+id+"              "+bestPlace.get(id));
		}
		System.out.println("\n**********************************");
	}

}