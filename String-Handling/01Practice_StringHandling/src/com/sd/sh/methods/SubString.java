package com.sd.sh.methods;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SubString {
	static int index,j;
 public static void main(String[] args) {
	System.out.print("Enter String : ");
	 Scanner scn = new Scanner(System.in);
	String str = scn.next();
	System.out.println("\n"+UniqueIndex(str));
	
	System.out.println(str.substring(5));
	System.out.println(str.substring(4,6));
	System.out.println(str.subSequence(6, 7));
	System.out.println(str.substring(1,0));

 }
 static int UniqueIndex(String str) {
	LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();
    for (int i=0; i<str.length();i++ )map.put(str.charAt(i),(map.getOrDefault(str.charAt(i), 0))+1);
	System.out.print(map);
    for (j=0; j<str.length();j++ ) if(map.get(str.charAt(j))==1)	return index=j;
	return -1;
 }
}