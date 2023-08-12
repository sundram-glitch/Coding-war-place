package com.wipro.org.strings;
import java.util.Scanner;
public class Problem04{
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
       public static void main(String[] args) {
		 Scanner sc  = new Scanner(System.in);
		 String str = sc.nextLine();
		 System.out.println(returnHalf(str));
	   }
	   private static String returnHalf(String str) {
		return str.length()%2==0?str.substring(0, str.length()/2):null;
	   }  
}
