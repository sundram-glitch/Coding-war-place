package com.sd.sh.methods;

public class Test17_append {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		System.out.println("SB capacity :"+sb1.capacity());
		System.out.println("SB length :"+sb1.length());
		System.out.println("SB chars :"+sb1);
		System.out.println();
		
		sb1.append("a");
		System.out.println("SB capacity :"+sb1.capacity());
		System.out.println("SB length :"+sb1.length());
		System.out.println("SB chars :"+sb1);
	    System.out.println();
	    
	    sb1.append(10);//{1,0} two memory occupy
	    System.out.println("SB capacity :"+sb1.capacity());
	    System.out.println("SB length :"+sb1.length());
	    System.out.println("SB chars :"+sb1);
	    System.out.println();
	    
	    Example ex=new Example();
	    sb1.append(ex);
	    System.out.println("SB capacity :"+sb1.capacity());
	    System.out.println("SB length :"+sb1.length());
	    System.out.println("SB chars :"+sb1);
	    System.out.println();
	    
	    sb1.append((String/*Object*/)null);
	    //sb1.append((char[])null); no null handling internal
	    System.out.println("SB capacity :"+sb1.capacity());
	    System.out.println("SB length :"+sb1.length());
	    System.out.println("SB chars :"+sb1);
	    System.out.println();
	    
	    StringBuffer sb2=new StringBuffer();
	    for(int i=0;i<=20;i++) {
	    	sb2.append(i);
	    }
	    System.out.println(sb2.capacity());
	    System.out.println(sb2.length());
	    System.out.println(sb2);
	}
}
