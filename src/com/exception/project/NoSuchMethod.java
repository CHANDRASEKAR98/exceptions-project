package com.exception.project;

public class NoSuchMethod {
    
    public static void main(String[] args) {
        
        try {
            String.class.getMethod("foobar");
            // String.class.getMethod("toString");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        
    }
    
}
