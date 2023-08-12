package com.sd.sh.methods;

import java.util.Arrays;
import java.util.Scanner;

public class Test07_ReverseString {

	public static void main(String[] args) {
	try (Scanner scanOf = new Scanner(System.in)) {
		System.out.println("Enter text");
		String str=scanOf.nextLine();  
		String strr=reverseOf(str);
	   System.out.println("Original\t"+str);
	   System.out.println("reversed\t"+strr);
		
	 }  
	}

	private static String reverseOf(String string) {
		//String st="";
		StringBuilder st=new StringBuilder();
		String[] strrr=string.split("");
		System.out.println(Arrays.toString(strrr));
		for(int i =strrr.length-1;i>=0;i--){
            //st=st.concat(strrr[i]+" ");
		      st.append(strrr[i]);
		      st.append(" ");
		}
		/*st=st.trim();
		return st;*/
		return st.toString().trim();
	}

}
