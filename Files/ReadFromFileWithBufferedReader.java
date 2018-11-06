package com.company.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {

            String currentLine;

            br = new BufferedReader(new FileReader("C:\\Users\\Jokinta\\Desktop\\file.txt"));

            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
