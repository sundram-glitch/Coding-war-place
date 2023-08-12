package com.wipro.org.strings;
import java.util.Scanner;
public class Problem01 {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
	public static void main(String[] args) {
    String str  = new Scanner(System.in).next();
	StringBuffer strBff = new StringBuffer(str);
	if(str.equalsIgnoreCase(strBff.reverse().toString()))System.out.println("Given String "+str+" is Palindrome");
	else System.out.println("Given String  "+str+" not a palindrome");
	}
}
