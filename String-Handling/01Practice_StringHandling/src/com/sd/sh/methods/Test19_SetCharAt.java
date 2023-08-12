package com.sd.sh.methods;

public class Test19_SetCharAt {

	public static void main(String[] args) {
    StringBuffer sb1=new StringBuffer("abc bbc cbc");
    System.out.println("SB chars :"+sb1);
	
    sb1.setCharAt(3,'-');
    System.out.println("SB chars :"+sb1);
    
    sb1.setCharAt(7,'-');
    System.out.println("SB chars :"+sb1);
    
    sb1.setCharAt(5,'B');
    System.out.println("SB chars :"+sb1);
    
    sb1.setCharAt(sb1.length()-1,'Y');
    System.out.println("SB chars :"+sb1);
    
    //sb1.setCharAt(sb1.length(),'x');
	sb1.replace(2,5,"PQR");
	System.out.println("SB chars :"+sb1);
	
	sb1.replace(2,7,"PQR");//remain 2 value replace with empty string 
	System.out.println("SB chars :"+sb1);
	sb1.replace(2,4,"MNOP");
	System.out.println("SB chars :"+sb1);
	}
}