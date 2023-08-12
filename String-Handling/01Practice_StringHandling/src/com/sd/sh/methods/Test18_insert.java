package com.sd.sh.methods;

public class Test18_insert {

	public static void main(String[] args) {
    StringBuffer sb1=new StringBuffer("acef");
    System.out.println("SB chars :"+sb1);
    
    sb1.insert(1,'b');
    System.out.println("SB chars "+sb1);
    
    sb1.insert(2,'d');
    sb1.insert(sb1.length()-1,'g');
    System.out.println("SB chars :"+sb1);
	
    sb1.insert(sb1.length(),"h");
    System.out.println("SB chars :"+sb1);
//  sb1.insert(sb1.length()+1,"d");
	sb1.insert(5,(String)null);
	System.out.println("SB CHARS :"+sb1);
	/*sb1.insert(5,(char[])null);
	System.out.println("SB CHARS :"+sb1);*/
	//sb1.insert(35,"b");
	//sb1.insert(-5,"b");
	System.out.println();
	
	StringBuffer sb2=new StringBuffer(2);
	sb2.append("ab");
	System.out.println("SB chars :"+sb2);
	sb2.insert(1, 'c');
	System.out.println("SB capacity :"+sb2.capacity());
	System.out.println("SB length :"+sb2.length());
	System.out.println("SB chars :"+sb2);
	System.out.println();
	
	sb2.insert (1,"45678901234567");
	System.out.println("SB capacity :"+sb2.capacity());
	System.out.println("SB length :"+sb2.length());
	System.out.println("SB chars :"+sb2);
	System.out.println();
	
	
	}
}