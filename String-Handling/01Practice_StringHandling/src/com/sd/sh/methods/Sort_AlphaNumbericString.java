package com.sd.sh.methods;

import java.util.*;

public class Sort_AlphaNumbericString {
  public static void main(String[] args) {
	String  str  = new Scanner(System.in).next();
	String newStr = "";
	ArrayList<Character> list = new ArrayList<>();
	for (int i = 0; i < str.length(); i++)list.add(str.charAt(i));
	ArrayList<Character> arr1  = new ArrayList<Character>();
	ArrayList<Character> arr2  = new ArrayList<Character>();
	for (int i = 0; i < list.size(); i++) {
		if(Character.isDigit(list.get(i))) arr1.add(list.get(i));
		else arr2.add(list.get(i));
	}
	Collections.sort(arr1, Collections.reverseOrder());
	Collections.sort(arr2);
	int no = 0, ch = 0;
	for (int i = 0; i < list.size(); i++) {
		if(Character.isDigit(list.get(i))) newStr +=arr1.get(no++);
		else newStr +=arr2.get(ch++);
	}
	System.out.println(newStr);
  }
}
