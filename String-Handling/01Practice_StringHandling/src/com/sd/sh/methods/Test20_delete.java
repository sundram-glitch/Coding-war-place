package com.sd.sh.methods;

public class Test20_delete {

	public static void main(String[] args) {
    StringBuffer sb1=new StringBuffer("Hari Ameerpet Krishna");
    System.out.println("SB chars :"+sb1);
    
    sb1.delete(5,13);
    System.out.println("SB chars :"+sb1);
    
    sb1.deleteCharAt(4);
    System.out.println("SB chars :"+sb1);
	System.out.println();
	
	StringBuffer sb2=new StringBuffer("abcdef");
	System.out.println("SB chars:"+sb2);
	sb2.deleteCharAt(1);
	sb2.deleteCharAt(2);
	System.out.println("SB chars :"+sb2);
	}
}
