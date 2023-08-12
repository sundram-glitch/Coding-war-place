package com.wipro.org.strings;

import java.util.Scanner;

public class Problem06 {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
     public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String str1 = sc.nextLine();
	 String str2 = sc.nextLine();
	 System.out.println(printLongestShortedString(str1, str2));
     }
	static String printLongestShortedString(String str1, String str2) {
		return str1+str2+str1;
	}
}
