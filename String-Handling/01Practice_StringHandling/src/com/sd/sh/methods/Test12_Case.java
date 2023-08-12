package com.sd.sh.methods;
//These toUpper & toLower method only having work on char
public class Test12_Case {

	public static void main(String[] args) {
		String s1="aBc";
		System.out.println(s1);
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println();
		String s2=s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println();
		
		String s3="aBc";
		System.out.println(s3);
		s3.toLowerCase();
		s3=s3.toLowerCase();
		System.out.println(s3);
		System.out.println();
		String s4=s3.toLowerCase();
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
		System.out.println();
		String s5=s1.toUpperCase();
		String s6=s1.toUpperCase();
		String s7=s6.toUpperCase();	
		System.out.println(s1);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s1==s5);
		System.out.println(s5==s6);
		System.out.println(s1.equals(s5));
		System.out.println(s5.equals(s6));
		System.out.println(s7==s6);
		System.out.println(s7.equals(s6));
		System.out.println(); 
		String s8="12@3";
		String s9=s8.toLowerCase();
		String s10=s8.toUpperCase();	
		System.out.println(s8);
	    System.out.println(s9);
	    System.out.println(s10);
	    System.out.println(s8==s9);
	    System.out.println(s8==s9);
	    System.out.println(s10==s9);
	    System.out.println();
	    
	    String s11="abc";
	    String s12=s11.toLowerCase();
	    String s13=s11.toUpperCase();
	    System.out.println(s11==s12);
	    s11=s11.toLowerCase();
	    System.out.println(s11);
	    s11=s11.toUpperCase();   
	System.out.println(s11);
	System.out.println(s12);
	System.out.println(s13);
	System.out.println(s11);
    System.out.println(s13==s11);	
    System.out.println(s11=s11.toLowerCase());
    System.out.println();
    //String s14=null;
    //System.out.println(s14.toUpperCase());
	String s15="null";
	System.out.println(s15.toUpperCase());
	/*String [] sar=new String[5];
	System.out.println(sar[0].toUpperCase());//null :-npe*/
	} 
}