package com.sd.it;
public class Different_package_level_tester{
	private int a = 10;
	        int b=23;
	protected int c=32;
	public int  d=345;

	public static void main(String[] args) {
		System.out.println("start of main ");
	Different_package_level_tester ts=new Different_package_level_tester();
     System.out.println("value  of a"+ts.a+"\nvalue  of b"+ts.b+"\nvalue  of c"+ts.c+"\nvalue  of d"+ts.d);
	}
}
