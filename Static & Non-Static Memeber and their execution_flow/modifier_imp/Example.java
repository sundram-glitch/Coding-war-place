package com.sd.super_type_of_Sample;
public class Example {
    static int a=m1();
	
	static{
    System.out.println("Example SB ");
	}

	int x=m2();

	{
	System.out.println("Example NSB");	
	}

	public Example(){
    System.out.println("Example Constructor");    
	}

	static int m1(){
    System.out.println("Example SV is created");
	       return 10; 
	}

	int m2(){
    System.out.println("Example NSV is created");
	       return 20;
	}

	public void abc(){
    System.out.println("Example abc exe");
	}
	
    void bbc(){
    System.out.println("Example bbc");
	}
  
	public static void main(String[] args){
		System.out.println("In start of main!");

	    System.out.println("In start of main!");
	}
}
