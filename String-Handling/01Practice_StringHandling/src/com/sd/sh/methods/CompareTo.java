package com.sd.sh.methods;

public class CompareTo {
 public static void main(String[] args) {
	 String str1 = "Negan";  
	 String str2 = "N";//empty string

	 //it would return the length of str1 in positive number
	 System.out.println(str1.compareTo(str2)); // 5

	 //it would return the length of str1 in negative number
	 System.out.println(str2.compareTo(str1)); //-5
}
}
