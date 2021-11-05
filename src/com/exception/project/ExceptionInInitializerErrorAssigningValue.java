package com.exception.project;

public class ExceptionInInitializerErrorAssigningValue {
    
    // assignment of static variable
    static int x = 20 / 0;
    public static void main(String[] args)
    {
        // printing the value of x
        System.out.println("The value of x is " + x);
    }
    
}
