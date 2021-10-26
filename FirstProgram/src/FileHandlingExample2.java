import java.io.FileWriter;  
import java.io.IOException;  
import java.util.Scanner;
public class FileHandlingExample2 {

	public static void main(String[] args) {
		 try{

	            FileWriter fw = new FileWriter("C:\\\\Users\\\\Neelakshi\\\\Desktop\\\\filehandling_test\\\\fileHandlingTest1.txt");

	            fw.write("Hey ! Java Topic: File Handling Example... \n This is Working..");

	            fw.close();

	            System.out.println("Content Uploaded Successfully..");
	            
	              }

		 catch (Exception e){ 

	            System.out.println("Error occurred"+e);

	            e.printStackTrace();

	        }

	}

}
