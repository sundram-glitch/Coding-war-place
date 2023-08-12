package com.sd.sh.methods;

//    public native String intern();
//used for adding and retrieving a string object to and from pool

import java.util.Scanner;

public class Test25_intern {

	public static void main(String[] args) {
    String s1="a";
    String s2="a";
    System.out.println(s1==s2);
    
    String s3=new String("b");
    String s4=new String("b");
    System.out.println(s3==s4);
	
    String s5=s1.concat(s2);
    String s6=s1.concat(s2);
    System.out.println(s5==s6);
    
    String s7=s1+s2;
    String s8=s1+s2;
    System.out.println(s7==s8);
    System.out.println();
    
    /*Scanner scanOf=new Scanner(System.in);
	String s9=scanOf.nextLine();
	String s10=scanOf.nextLine();//runtime var value not comes under pooling
	System.out.println(s9==s10);*/
	
    String s11="H";
    String s12=s11.intern();//used for adding and retrieving a string object to and from pool
    System.out.println(s11==s12);
	System.out.println();
	
	String s13=new String("NIT").intern();
	String s14=s13.intern();
    String s15="NIT";
	String s16=new String("NIT");
    System.out.println(s13==s14);
	System.out.println(s13==s15);
	System.out.println(s13==s16);
	System.out.println(s14==s15);
	System.out.println(s15==s16);
	System.out.println();
	
	String s17=new String("NIT").intern();
	String s18=new String("NIT").intern();
	System.out.println(s17==s18);
	System.out.println();
	
	String s19="S";
	String s20=s19.concat("D");
	String s21=s19.concat("D");
	System.out.println(s20==s21);
	String s22=s19.concat("D").intern();
	String s23=s19.concat("D").intern();
	System.out.println(s22==s23);
	System.out.println();
	
	String s24="S D";
	System.out.println(s23==s24);
	}
}
