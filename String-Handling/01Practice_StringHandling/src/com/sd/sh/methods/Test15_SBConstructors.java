package com.sd.sh.methods;

public class Test15_SBConstructors {

	public static void main(String[] args) {
    StringBuffer sb1=new StringBuffer();
    System.out.println("sb1 capacity:\t"+sb1.capacity());
    System.out.println("sb1 size :\t"+sb1.length());
    System.out.println("sb1 chars :\t"+sb1);
	System.out.println();
	
	StringBuffer sb2=new StringBuffer(5);
	System.out.println("sb2 capacity:\t"+sb2.capacity());
	System.out.println("sb2 size :\t"+sb2.length());
	System.out.println("sb2 chars :\t"+sb2);
	System.out.println();
	
	StringBuffer sb3=new StringBuffer("abc");
	System.out.println("sb3 capacity:\t"+sb3.capacity());
	System.out.println("sb3 size :\t"+sb3.length());
	System.out.println("sb3 chars :\t"+sb3);
	System.out.println();
	sb3.append("d");

	StringBuffer sb4=new StringBuffer(sb3);
	System.out.println("sb4 capacity:\t"+sb4.capacity());
	System.out.println("sb4 size :\t"+sb4.length());
	System.out.println("sb4 chars :\t"+sb4);
	System.out.println();
    
	//StringBuffer sb5=new StringBuffer(-5);
    StringBuffer sb6=new StringBuffer(0);
    //StringBuffer sb7=new StringBuffer(null);
    //String sb8=new String(null);
    //StrinBuffer sb9="null";
    //StringBuffer sb10=new StringBuffer((String)null);
	StringBuffer sb11=null;
    System.out.println("sb11:"+sb11);
    System.out.println();
    
    StringBuffer sb12=new StringBuffer("null");
    System.out.println("sb12 capacity :"+sb12.capacity());
    System.out.println("sb12 size :"+sb12.length());
    System.out.println("sb12 chars :"+sb12);
	}
}
