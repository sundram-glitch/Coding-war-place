package com.sd.sh.methods;

import java.util.Scanner;

public class EmbaddedStringLength {

	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strr = scan.next();
		StringBuffer str  = new StringBuffer(strr);
	    int temp = str.length()-1;
	    int index = strr.indexOf(Integer.toString(temp));
	    str.deleteCharAt(index);
	    System.out.println(str);
	    
	 }
}
