package com.exception.project;

public class ExceptionInInitializerErrorNullValue {
    
    // declaring a static initializer  block
    static
    {
        // creating a string and assigning a null value to it
        String s = null;
        if(s == null)
            System.out.println("Cannot find the length of null string");
        else
            // printing the length of string if the value is not null
            System.out.println(s.length());
    }
    
    public static void main(String[] args) {
        
        System.out.println("The Program runs smoothly");
        
    } 
}
