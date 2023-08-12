package com.sd.sub_type_of_Example;
import com.sd.super_type_of_Sample.Example;
class Sample extends Example{
    static int a=m1();
	
	static{
    System.out.println("Sample SB ");
	}

	int x=m2();

	{
	System.out.println("Sample NSB");	
	}

	Sample(){
    System.out.println("Sample Constructor");    
	}

	static int m1(){
    System.out.println("Sample SV is created");
	       return 10; 
	}

	int m2(){
    System.out.println("Sample NSV is created");
	       return 20;
	}

	public void abc(){
    System.out.println("Sample abc exe");
	}
	
    void bbc(){
    System.out.println("Sample bbc");
	}
  
	public static void main(String[] args){
		System.out.println("In start of main!");
    Example e=new Sample();
	e.abc();
	Sample s=new Sample();
	//System.out.print("e.a:"+e.a);
	    System.out.println("In start of main!");
	}
}
