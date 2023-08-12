package com.wipro.org.strings;
import java.util.Scanner;
public class Problem02{
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
    public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	String arr[]  = str.split(",");
    System.out.println(concateInToLowerCase(arr[0], arr[1]));
	}
	 static String concateInToLowerCase(String str1, String str2) {		 
		 return str1.charAt(str1.length()-1)==str2.charAt(0)?str1+str2.substring(1, str2.length()-1):str1+" "+str2;
	}
      
}
