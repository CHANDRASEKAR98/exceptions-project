package com.exception.project;

public class InterruptExePropagation extends Thread {
    
    public void run(){  
        try {  
            Thread.sleep(1000);  
            System.out.println("task");  
        }
        catch(InterruptedException e) {  
            throw new RuntimeException("Thread interrupted..."+e);  
        }
        System.out.println("thread is running..."); 
    }  
    
    public static void main(String[] args) {
        InterruptExePropagation t1 = new InterruptExePropagation();
        t1.start();  
        t1.interrupt();  
    }
}
