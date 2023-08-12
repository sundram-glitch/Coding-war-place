package com.sd.sh.methods;


import java.util.Scanner;

public class UniqueCharacter {
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String str = scn.next().toLowerCase();
	StringBuffer sb = new  StringBuffer(str);
	int len = sb.length();
	int count=0;
	for (int i = 0; i < len; i++,count=0) {
	 	for (int j = 1+i; j < sb.length(); j++) {
			if(sb.charAt(i)==sb.charAt(j)) {
				sb.deleteCharAt(j);
				j--;
			count++;
			}
		}
	 	if(count>0) {
	 		sb.deleteCharAt(i);
	 	len--;
	 	i--;
	 	}
	}
	 System.out.println(sb);
}
}
