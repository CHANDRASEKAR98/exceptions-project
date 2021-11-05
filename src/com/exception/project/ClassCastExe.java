package com.exception.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassCastExe {
    
    public static void main(String[] args) {
//        String[] strArray = new String[] { "John", "Snow" };
//        ArrayList<String> strList = (ArrayList<String>) Arrays.asList(strArray);
//        System.out.println("String list: " + strList);
        
        String[] strArray = new String[] { "John", "Snow" };
        List<String> strList = new ArrayList<>(Arrays.asList(strArray));
        System.out.println("String list: " + strList);
    }
}
