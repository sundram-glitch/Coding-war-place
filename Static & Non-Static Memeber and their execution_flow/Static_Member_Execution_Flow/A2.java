package com.sd.super_type_of_B2;
public class A2{
	public static int a=10;

	static{
    System.out.println("In A SB");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	System.out.println("B2.b:"+B2.b);
	System.out.println("B2.getB():"+B2.getB());
	}
	public static void main(String[] args){
		System.out.println("main method start");
        
	    System.out.println("main method end");
	}
}
