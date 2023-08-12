package com.sd.sh.methods;

import java.util.Scanner;

public class Digit_Count_Str {
  public static void main(String[] args) {
	String str = new Scanner( System.in).next();
    System.out.println(countDigits(str));
}

private static int countDigits(String str) {
	int count =0;
	for (int i = 0; i < str.length(); i++) {
		if(Character.isDigit(str.charAt(i)))
			count++;
	}
	return count++;
}
}
