package com.exception.project;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileNotFoundAccessDenied {
    
    public static void main(String[] args) {
     // starting try block
        try {
            // Opening the file
              File f=new File("D:\\MDM\\MDM-Project\\file.txt");   
                
            // creating printWriter object
            // by intiating fileWriter 
            PrintWriter p1=new PrintWriter(new FileWriter(f), true);
                
            // printing sample text
            p1.println("Hello world program");
              p1.close();
            
            // changing the file operation 
            // to read-only 
            // f.setReadOnly();
            
            // trying to write to new file
            PrintWriter p2=new PrintWriter(new FileWriter("D:\\MDM\\MDM-Project\\file1.txt"), true);
            p2.println("Hello World1");
            System.out.println("File1 is written");
        }
          
        // catching exception thrown
        // by try block
        catch(Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}
