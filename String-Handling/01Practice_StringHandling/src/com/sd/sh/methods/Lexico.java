package com.sd.sh.methods;

import java.util.Scanner;

public class Lexico {
static String str;
	public static void main(String[] args) {
	Scanner getValue=new Scanner(System.in);
		str = getValue.next();
		char ch=str.charAt(0);
     for (int i = 0; i < str.length(); i++) {
		System.out.print(ch);
	}
	}
}
