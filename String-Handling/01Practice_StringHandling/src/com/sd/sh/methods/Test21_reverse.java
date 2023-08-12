package com.sd.sh.methods;

public class Test21_reverse {

	public static void main(String[] args) {
    StringBuffer sb1=new StringBuffer("abc cbc");
    System.out.println("SB chars :"+sb1);
    System.out.println();
    
    sb1.reverse();
    System.out.println("SB chars :"+sb1);
    System.out.println();
    
    StringBuffer sb2=sb1.reverse();
    System.out.println(sb2==sb1);
	}
}
