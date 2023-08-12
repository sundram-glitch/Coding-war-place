package com.sd.sh.methods;

public class Test01_StringPooling {

	public static void main(String[] args) {
    //Case #1: literals
		String s1 ="Hari";
		String s2 ="Hari";
		System.out.println(s1==s2);
		System.out.println();
	//Case #2: new Keyword & constructor
		String s3 = new String("NIT");
		String s4 = new String("NIT");
		System.out.println(s3==s4);
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println();
	}

}
