package com.wipro.org.customexception;
import java.util.*;
public class Problem03 {
     public static void main(String[] args) {
	   try(Scanner sc = new Scanner(System.in)){
	   Student [] arr = new Student[2];
	    for (int i = 0; i < arr.length; i++) {
		 String name = sc.nextLine();
		 int math = sc.nextInt();
		 if(math>100 || math<0) throw new NegativeValueException("Invalid Inputs ");
		 int science  = sc.nextInt();
		 if(science>100 || math<0) throw new NegativeValueException("Invalid Inputs ");
		 int english = sc.nextInt();
		 if(english>100 || math<0) throw new NegativeValueException("Invalid Inputs ");
		 arr[i] = new Student(name, math, science, english);
	    }
	   }
	   catch(NumberFormatException ioe) {
		   System.out.println(ioe.getMessage());
	   }
	   catch(NegativeValueException neve) {
		   System.out.println(neve.getMessage());
	   }
	 }
}
