package com.exception.project;

public class InterruptResumeRunning extends Thread {
    
    public void run(){  
        try {  
            Thread.sleep(1000);  
            System.out.println("task");  
        }
        catch(InterruptedException e) {  
            System.out.println("Exception thrown = "+ e); 
        }
        System.out.println("thread is running..."); 
    }
    
    public static void main(String[] args) {
        InterruptResumeRunning t1 = new InterruptResumeRunning();
        t1.start();  
        t1.interrupt();   
    } 
}
