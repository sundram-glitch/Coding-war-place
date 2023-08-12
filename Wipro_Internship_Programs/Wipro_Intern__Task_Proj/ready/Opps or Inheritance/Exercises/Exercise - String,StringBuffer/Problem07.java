package com.wipro.org.strings;

import java.util.Scanner;

public class Problem07 {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String str = sc.nextLine();
	 System.out.println(removeLeadingPreccidingX(str));
  }
  static String removeLeadingPreccidingX(String str) {
	StringBuffer strBff = new StringBuffer(str);
	  while(strBff.charAt(0)=='x' && strBff.charAt(strBff.length()-1)=='x') {
		  strBff.deleteCharAt(0);
		  strBff.deleteCharAt(strBff.length()-1);
	  }
	  return strBff.toString();
}
}
