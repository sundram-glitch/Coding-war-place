package com.sd.sh.methods;

public class Test22_SBCapacityControlling_enCap {

	public static void main(String[] args) {
    StringBuffer sb1=new StringBuffer(3);
    System.out.println(sb1.capacity());
    
    sb1.ensureCapacity(4);
    System.out.println(sb1.capacity());
	
    sb1.ensureCapacity(20);
	System.out.println(sb1.capacity());

	sb1.ensureCapacity(15);
	System.out.println(sb1.capacity());

	sb1.ensureCapacity(0);
	System.out.println(sb1.capacity());
	
	sb1.ensureCapacity(-5);
	System.out.println(sb1.capacity());
	
	sb1.append("abcd");
	System.out.println(sb1.capacity());
    System.out.println(sb1.length());
    

    sb1.trimToSize(); 
	System.out.println(sb1.capacity());
	System.out.println(sb1.length());
	}

}
