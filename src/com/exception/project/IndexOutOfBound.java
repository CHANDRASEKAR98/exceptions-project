package com.exception.project;

import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBound {
    
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("a");
        ls.add("b");
        // ls.get(3);       // Exception thrown
        
        // solution
        String str = "";
        int index =3; 
        if(index < ls.size())    // check, list size must be greater than index
            str = ls.get(index);
        else {
            str = "The Index is greater that the size of the List";
            System.out.println(str);
        }
        
    }
    
}
