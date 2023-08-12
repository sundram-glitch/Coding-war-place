package com.wipro.org.strings;
import java.util.Scanner;
public class Problem09 {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String str1  = sc.nextLine();
	 String str2  = sc.nextLine();
	 System.out.println(concateByInd(str1, str2));
   }
   static String concateByInd(String str1, String str2) {
    String res = "";
    for (int i = 0; i <str1.length() && i <str2.length(); i++)
    	res +=((str1.charAt(i)+"")+(str2.charAt(i)+""));
    	return res;
   }
}
