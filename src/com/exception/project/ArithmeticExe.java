package com.exception.project;

public class ArithmeticExe {
    
    public static void main(String[] args) {
        int a = 0, b = 10;
        //int c = b/a;
        
        int c = 0;
        try {
            c = b/a;
        } 
        catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("We are just printing the stack trace.\n"+ "ArithmeticException is handled. But take care of the variable \"c\"");
         }
        System.out.println("Value of c is : "+ c);
    }
}
