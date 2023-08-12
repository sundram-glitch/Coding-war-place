package com.sd.sh.methods;

public class Test08_ReverseString {
		public static void main(String[] args){
			System.out.println("Enter text!");
		System.out.println("The reversed string is :- \n"+reverseChar(new java.util.Scanner(System.in).nextLine()));
		}
		public static String reverseChar(String string){
		StringBuilder sb=new StringBuilder();
		for (int i=string.length()-1;i>=0;i-- ){
			sb.append(string.charAt(i));
		}
		return sb.toString();
	}
}

