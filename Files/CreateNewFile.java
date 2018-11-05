package com.company.Files;
import java.io.File;
import java.io.IOException;
public class CreateNewFile {
    public static void main( String[] args ){
        try {
            File file = new File("C:\\Users\\Jokinta\\Desktop\\file.txt");
            boolean isCreated = file.createNewFile();
            if (isCreated){
                System.out.println("File has been created successfully");
            }
            else{
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
}
