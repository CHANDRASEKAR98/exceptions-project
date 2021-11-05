package com.exception.project;

import java.lang.reflect.Field;  

public class NoSuchField {
    
    public int num;
    
    public static void main(String[] args) throws NoSuchFieldException {
        Class<NoSuchField> obj = NoSuchField.class;  
        Field fields = obj.getField("num");
        // Field fields = obj.getField("noType");  
        System.out.println(fields);  
        Class<?> tp = fields.getType();  //gets the type   
        System.out.println(tp);
    }
    
}
