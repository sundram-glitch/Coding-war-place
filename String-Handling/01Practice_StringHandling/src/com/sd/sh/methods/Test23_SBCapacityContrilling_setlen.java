package com.sd.sh.methods;

public class Test23_SBCapacityContrilling_setlen {

	public static void main(String[] args) {
    StringBuffer sb1=new StringBuffer();
    sb1.append("abc");
    
    System.out.println("Capacity :"+sb1.capacity());
    System.out.println("size :"+sb1.length());
    System.out.println("chars :"+sb1);
    System.out.println("Capacity :"+sb1.capacity());
    System.out.println();
    
    sb1.setLength(6);
    
    System.out.println("Capacity :"+sb1.capacity());
    System.out.println("size :"+sb1.length());
    System.out.println("chars :"+sb1);
    System.out.println("is it \0"+String.valueOf(sb1.charAt(3)).equals("\0"));
	System.out.println();
	
    sb1.trimToSize();
    System.out.println("Capacity :"+sb1.capacity());
    System.out.println("size :"+sb1.length());
    System.out.println("chars :"+sb1);
	
	sb1.append("ghi");
	System.out.println("Capacity :"+sb1.capacity());
	System.out.println("size :"+sb1.length());
	System.out.println("chars :"+sb1);
	System.out.println();
	
    sb1.replace(3, 5,"def");
    System.out.println("Capacity :"+sb1.capacity());
    System.out.println("size :"+sb1.length());
    System.out.println("chars :"+sb1);
    System.out.println();
    
	StringBuffer sb2=new StringBuffer(7);//
	sb2.append("abc");

	System.out.println("Capacity :"+sb2.capacity());
	System.out.println("size :"+sb2.length());
	System.out.println("chars :"+sb2);
	System.out.println();
	
	sb2.setLength(5);
	System.out.println("Capacity :"+sb2.capacity());
	System.out.println("size :"+sb2.length());
	System.out.println("chars :"+sb2);
	System.out.println();
	
	}
}
