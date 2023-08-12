package com.hcl.sd;

public class MultiThreadingDemoUsingThreadOnly02 extends Thread{
	 public void run(){
	        try {
	            System.out.println(
	                "Thread " + Thread.currentThread().getName()
	                + " is running");
	        }
	        catch (Exception e) {
	            System.out.println("Exception is caught");
	        }
	    }
	 
	    public static void main(String[] args){
	        int n = 8; // Number of threads
	        for (int i = 0; i < n; i++) {
	        	MultiThreadingDemoUsingThreadOnly02 object
	                = new MultiThreadingDemoUsingThreadOnly02();
	            object.start();
	        }
        }

}