package com.sd.sh.methods;

public class Test14_trim {

	public static void main(String[] args) {
    String s1="  abc bbc   ";
    System.out.println(s1.length());
    s1.trim();
    System.out.println(s1.length());
    System.out.println();
	String s2=s1.trim();
	System.out.println(s2.length());
	String s3=s2.trim();
	System.out.println(s2.length());
	System.out.println(s3.length());
	System.out.println(s2==s3);
	System.out.println();
	
	String s4=s1.replace(" ","");
	System.out.println(s4);
	
	String s6=s1.trim();
	String s7=s1.trim();
	System.out.println(s6==s7);
	System.out.println();
	
	String s8=s6.trim();
	System.out.println(s6==s8);		
	}
}
