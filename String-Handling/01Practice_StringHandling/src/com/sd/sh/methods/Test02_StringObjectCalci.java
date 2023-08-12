package com.sd.sh.methods;

import java.util.Scanner;

public class Test02_StringObjectCalci {
public static void main(String[] args) {
	String s1 = "a";
    String s2 = "a";
    String s3 = "A";
    System.out.println(System.identityHashCode(s1)+"\t"+System.identityHashCode(s2));
    System.out.println(System.identityHashCode(s3));
System.out.println();

String s4 = new String("a");
String s5 = new String("b");
String s6 = new String("b");
String s7 = new String(s6);
//String s8 = s6;
System.out.println(System.identityHashCode(s4));
System.out.println(System.identityHashCode(s5));
System.out.println(System.identityHashCode(s6));
System.out.println(System.identityHashCode(s7));
//System.out.println(System.identityHashCode(s8));
 System.out.println();
 
String s8=s1.concat(s2);
String s9=s1.concat(s2);
System.out.println("1 "+System.identityHashCode(s8));
System.out.println("2 "+System.identityHashCode(s9));
System.out.println();

String s10=s1+s2;
String s11=s1+s2;
System.out.println(System.identityHashCode(s10));
System.out.println(System.identityHashCode(s11));
System.out.println();

String s12="b";
String s13="ab";
String s14="a"+"b";
String s15=s1+s2;
System.out.println(System.identityHashCode(s12));
System.out.println("1 "+System.identityHashCode(s13));
System.out.println("2 "+System.identityHashCode(s14));
System.out.println("3 "+System.identityHashCode(s15));
System.out.println();

String s19 = "a".concat("b");
String s20 = "a".concat("b");
String s21="c".concat("d");
String s22= "c".concat("d");  
System.out.println("3 "+System.identityHashCode(s19));
System.out.println("4 "+System.identityHashCode(s20));
System.out.println(System.identityHashCode(s21));
System.out.println(System.identityHashCode(s22));
System.out.println();

Scanner scanof=new Scanner(System.in);
String s23=scanof.next();
String s24=scanof.next();
System.out.println(System.identityHashCode(s23));
System.out.println(System.identityHashCode(s24));
}
}
