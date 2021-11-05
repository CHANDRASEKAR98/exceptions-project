package com.exception.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundNoSuchDirectory {
    
    public static void main(String[] args) {
        // while loop to read data 
        // and printing them
        try {
            FileReader reader = new FileReader("D:\\MDM\\MDM-Project\\file.txt");
            
            // passing FileReader to
            // buffered reader
            BufferedReader br = new BufferedReader(reader);
              
            // declaring empty string 
            String data =null;
            
            while ((data = br.readLine()) != null) 
            {
                System.out.println(data);
            }
            
            // closing the object
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
