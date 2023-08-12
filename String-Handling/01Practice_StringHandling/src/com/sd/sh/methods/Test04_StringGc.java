package com.sd.sh.methods;

public class Test04_StringGc {
  public static void main(String[] args) throws InterruptedException {
	String[] s1=args;
	System.out.println(System.identityHashCode(s1));
	s1=null;
	Thread.sleep(5000);
	System.gc();
	String[] s2 =args;
	  System.out.println(System.identityHashCode(s2));
}
}
