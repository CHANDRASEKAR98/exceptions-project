package com.exception.project;

//Creating a thread in our myThread class by extending the
//Thread class
//class 1
//Helper class

class myThread extends Thread {
 // Method in helper class
 // declaring run method
 public void run()
 {
     for (int i = 0; i < 5; i++) {       
         // Display message
         System.out.println("Program Running");
     }
 }
}

public class IllegalStateExe {
    
    public static void main(String[] args) {
        myThread t = new myThread();
        
        // Starting the above created thread
        // using the start() method
        t.start();
       
        try {
            System.out.println("Main Thread is going to sleep");
           
            // making main thread sleep for 2000ms
            t.sleep(2000);
           
            System.out.println("Main Thread awaken");
        }
        catch (Exception e) {
            System.out.println(e);
        }
 
        // Display Message
        System.out.println("Main Thread");
        
        // t.start();   // causes Exception
        
    }
    
}
