package com.sd.sub_type_of_A2;
import com.sd.super_type_of_B2.A2;
public class B2 extends A2{
	public static int b=20;

	static{
    System.out.println("In B SB");
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	System.out.println("B2.b:"+B2.b);
	System.out.println("B2.getB():"+B2.getB());
	}
	static int getB(){
		return b;
	}
	public static void main(String[] args){
		System.out.println("main method start");
        
	    System.out.println("main method end");
	}
}
