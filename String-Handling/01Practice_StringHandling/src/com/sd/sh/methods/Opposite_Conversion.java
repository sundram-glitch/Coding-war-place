package com.sd.sh.methods;

import java.util.Scanner;

public class Opposite_Conversion {
  public static void main(String[] args) {
	String str = new Scanner(System.in).nextLine();
	StringBuffer brr = new StringBuffer(str);
    for (int i = 0; i < brr.length(); i++) {
		Character c= str.charAt(i);
	if(Character.isLowerCase(c)) 
		brr.replace(i,i+1, Character.toUpperCase(c)+"");
	else 
	    brr.replace(i, i+1, Character.toLowerCase(c)+"");
}
    System.out.println(brr);
}
}
