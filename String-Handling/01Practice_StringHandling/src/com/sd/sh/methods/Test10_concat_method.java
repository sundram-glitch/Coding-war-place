package com.sd.sh.methods;

public class Test10_concat_method {

	public static void main(String[] args) {
    String s1="\"Hari\"";
    String s2=s1.concat("Krishna");
    System.out.println("s1:"+s1);
    System.out.println("s2:"+s2);
    System.out.println();
    String s3="a";
    s3.concat("b");
    System.out.println();
    String s4=s3.concat("c");
    System.out.println("s3:"+s3);
    System.out.println("s4:"+s4);
    System.out.println(s3==s4);
    System.out.println();
    s3=s3.concat("d");
    System.out.println(s3);
    System.out.println();
    System.out.println(s3=s3.concat("f"));
    System.out.println();
    String s5=s3.concat("");
    System.out.println("s3:"+s3);
    System.out.println("s5:"+s5);
    System.out.println(s3==s5);
    System.out.println();
    String s6="";
    String s7=s6.concat(s3);
    System.out.println();
    System.out.println("s6:"+s6);
    System.out.println("s7:"+s7);
    System.out.println(s6==s7);
    System.out.println(s3==s7);
    System.out.println();
    
    String s8="p";
    String s9=s8+"q";
    String s10=s8+"";
    String s11=""+s8;
    System.out.println("s8:"+s8);
    System.out.println("s9:"+s9);
    System.out.println("s10:"+s10);
    System.out.println("s11:"+s11);
    System.out.println(s8==s9);
    System.out.println(s8==s10);
    System.out.println(s10==s11);
	System.out.println();
	String s12="abc";
	String s13="a"+"b"+"c";
	String s14="a".concat("b").concat("c");
	System.out.println(s12==s13);
	System.out.println(s12==s13);
	System.out.println();
	String s15="a";
	String s16=s15.concat("b");
	String s17=s15.concat("b");
	System.out.println(s16==s17);
	System.out.println();
	String s18=s15.concat("");
	String s19=s15.concat("");
	System.out.println(s15==s18);
	System.out.println(s15==s19);
	System.out.println(s18==s19);
	//String s20=null+null;//add two nums chars and two strings + any type
	//String s21=null.concat(null);
	String s22=null+" "+"a";
	System.out.println(s22);
	System.out.println();
	String s23=null;
	String s24=null;
	String s25=s23+s24;
	//String s26=s24.concat(s23);
	System.out.println(s25);
	String s27=7+8+"hari"+8+7;//l to r
	System.out.println(s27);
	System.out.println();
	//String s28=null+7+8+"hari"+8+7;
	String s29="a";
	String s30="a";
	System.out.println("s29==s30"+(s29==s30));
	System.out.println("s29==s30"+s29==s30);
    String s31="abc";
    String s32="bbc";
    String s33=s31+s32;
    System.out.println(s33);
    System.out.println();
    String s34=new StringBuilder().append(s31).append(s32).toString();//+operatpr background code
    System.out.println(s34);  
    System.out.println();
    String s35=s31+s32+s31+s32;
    System.out.println(s35);
    String s36="a"+9;
    //String s37="a".concat(9);
    System.out.println();
    
	}	     
}