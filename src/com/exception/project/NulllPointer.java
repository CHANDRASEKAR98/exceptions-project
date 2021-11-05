package com.exception.project;

public class NulllPointer {
    
    public static void main(String[] args) {
        String password = null;
        if(password != null) {
            if (password.equals("gfg"))
                System.out.print("Same");
            else 
                System.out.print("Not Same");
        }
        else {
            System.out.println("Password cannot be Null");
        }
    } 
}
