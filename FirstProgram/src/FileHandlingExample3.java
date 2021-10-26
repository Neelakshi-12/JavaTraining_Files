
import java.io.File; 

import java.io.FileNotFoundException;  

import java.util.Scanner; 

public class FileHandlingExample3{

    public static void main(String[] args){

        try{

            File fw = new File("C:\\\\Users\\\\Neelakshi\\\\Desktop\\\\filehandling_test\\\\fileHandlingTest1.txt");

            Scanner sc = new Scanner(fw);

            while (sc.hasNextLine()){

                String dataInfo = sc.nextLine();

                System.out.println(dataInfo);

            }

            sc.close();

        }

        catch (Exception e){ 

            System.out.println("Error occurred"+e);

            e.printStackTrace();

        }

    }

}