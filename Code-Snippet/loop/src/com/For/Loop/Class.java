package com.For.Loop;

import java.util.ArrayList;
import java.util.Scanner;
public class Class {
		
		public static void main(String...args) {
			System.out.println("MarriageServlet.doPost(): Server side form validation logic ");
			System.out.println("start!");
			//general setting\
			Scanner scanOf=new Scanner(System.in);
			
			String name=null;
			
			String page=null;
			
			String Gender=null;
	        int age=0;
		//get parameter values as per html names
	    System.out.println("Enter name");
		name=scanOf.next();
		System.out.println("Enter age");
		page=scanOf.next();
		System.out.println("Enter Gender");
		Gender=scanOf.next();
		//from validation logic(server side)
		ArrayList<String> errList= new ArrayList<String>();
	    if(name==null || name.equals("") || name.length()==0 ){//required rule
	    	errList.add("Person name is required");
	    }
	    else if(name.length()<8){
	    errList.add("Person name must have minimum 8 characters");
	    }
	    if(page==null || page.equals("") ||  page.length()==0 ) {
	    errList.add("Person age is required");
	    }
	    else{
	    	try {
	    		age=Integer.parseInt(page);
	    		if(age<1 || age>125) {
	    			errList.add("Person age must be given 1 through 125");
	    		}
	    	}
	    	catch (NumberFormatException nfe) {
	    errList.add("Person age must be numeric values");
	    	}
	    }
	    try {
	    if(Gender.equals(null)) {
	    	System.out.println("age is required ");
	    }
	    }
	    catch (NullPointerException npe){
	    errList.add("Age is required");
	    }
	    //Display form validation error message
	    if(!errList.isEmpty()) {
	    	errList.forEach(msg->{//java 8 for each method with lambda exp
	    	System.out.println(""+msg+"");
	    	 return;});
	    	return;
	   	}
	    if(Gender.equalsIgnoreCase("f")){
		
		if(age>=18)
			System.out.println(""+name+" ");
		
	    else
		    System.out.println(""+name+" you are not eligible for marry "+"wait "+(18-age)+"years ");
		 
		}
		else{
	     if(age>=21)
		    System.out.println("<h1 style='color:green;text-align:center' >"+name+" you are eligible for marry"+"</h1>");
		
		else 
			System.out.println(""+name+" you are'nt eligible for marry"+" wait "+(21-age)+"years");
		}
	  }
}
