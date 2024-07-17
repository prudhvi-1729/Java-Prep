package collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionFile {
    public static void main(String[] args){
        try {
            //static method
            readFile("E:/UPSKILL/Angular Installation.txt");
        }
        catch (FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static void readFile(String filePath) throws FileNotFoundException{
        File fl = new File(filePath);
        Scanner sc = new Scanner(fl);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

        sc.close();
    }
}
