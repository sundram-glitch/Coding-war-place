package com.hcl.sd;

class MultithreadingDemo implements Runnable {
    public void run()
    {
        try {
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
 
public class MultiThreadingDemoUsingRunnable01 {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                = new Thread(new MultithreadingDemo());
            object.start();
        }
    }
}