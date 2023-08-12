package com.wipro.org.strings;
import java.util.Scanner;
public class Problem08{
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
    public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(removeChar(str));
	}
	 static String removeChar(String str) {
     StringBuffer strBff = new StringBuffer(str);
		 while(strBff.toString().contains("*")) {
			 int index = strBff.indexOf("*");
			 strBff.deleteCharAt(index+1);
			 strBff.deleteCharAt(index);			 
			 strBff.deleteCharAt(index-2);
		 }
		 return strBff.toString();
	}
}
