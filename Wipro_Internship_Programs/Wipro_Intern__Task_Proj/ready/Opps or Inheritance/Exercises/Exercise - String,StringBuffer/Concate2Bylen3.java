package com.wipro.org.strings;

import java.util.Scanner;

public class Concate2Bylen3 {
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String str = sc.nextLine();
	 System.out.println(returnConcateBy2(str));
   }
   static String returnConcateBy2(String str) {
       String sub = str.substring(0,2);
	   String res = "";
	   for (int i = 0; i < str.length(); i++) 
         res +=sub;
       return res;
}
}
