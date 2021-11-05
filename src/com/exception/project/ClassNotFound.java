package com.exception.project;

public class ClassNotFound {
    
    public static void main(String[] args) {
        try 
        {
            Class.forName("Sample");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
    }
    
}
