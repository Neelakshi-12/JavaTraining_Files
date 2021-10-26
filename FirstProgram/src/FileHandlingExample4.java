
import java.io.File; 

public class FileHandlingExample4{

    public static void main(String[] args){ 

        File fw = new File("C:\\\\Users\\\\Neelakshi\\\\Desktop\\\\filehandling_test\\\\fileHandlingTest1.txt"); 

        if(fw.delete()){ 

            System.out.println("The file : " + fw.getName() + "is deleted successfully.");

        }

        else{

            System.out.println("Deletion Failed.");

        } 

    } 

}