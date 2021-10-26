import java.io.File;  
import java.io.FileWriter;   
import java.io.IOException;  
public class FileHandlingExample1{

    public static void main(String[] args){

        try{

            File obj = new File("C:\\Users\\Neelakshi\\Desktop\\filehandling_test\\fileHandlingTest1.txt");

            if(obj.createNewFile()){ 

                System.out.println("The File created successfully:" + obj.getName());
                System.out.println("The absolute path of the file is:" + obj.getAbsolutePath()); 
              
              }

            else{ 

                System.out.println("File already exists");

            }

        }

        catch (Exception e){ 

            System.out.println("Error occurred"+e);

            e.printStackTrace();

        }

    }

}