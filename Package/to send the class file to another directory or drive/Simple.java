//save as Simple.java  
package mypack;
class Example{  
 public static void m1(){  
    System.out.println("Welcome to m1");  
   }  
}  
  
public class Simple{  
 public static void main(String args[]){  
    System.out.println("Welcome to main");  
	Example.m1();
   }  
}  