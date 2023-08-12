package com.wipro.org.strings;
import java.util.Scanner;
public class Problem03 {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String str = sc.nextLine();
	 int n = sc.nextInt();
	 System.out.println(concatFistTwoNTimes(str,n));
   }
   static String concatFistTwoNTimes(String str, int n) {
       String sub = str.substring(0, 2);
       String res = "";
       for (int i = 0; i <n; i++) 
               res +=sub;
	   return res;
   }
}
