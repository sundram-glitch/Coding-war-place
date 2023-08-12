package com.sd.sh.methods;

import java.util.StringTokenizer;

public class Test09_StringTokenizer/*java 1.0v*/ {

	public static void main(String[] args) {
    String str="Java Hari Krishna NIT Ameerpet";
		//StringTokenizer st=new StringTokenizer(str);
		//StringTokenizer st=new StringTokenizer(str,"r");
    StringTokenizer st=new StringTokenizer(str,"r",true);
    System.out.println(st.countTokens());
	/*
	 * while(st.nextToken() != null) { Object string=(Object)st;
	 * System.out.println(str); }
	 */
	while(st.hasMoreElements()){
		String sf=(String)st.nextToken();
		System.out.println(sf);
	}
	}
}
