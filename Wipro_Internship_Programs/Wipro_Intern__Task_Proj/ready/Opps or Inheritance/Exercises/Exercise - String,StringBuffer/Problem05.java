package com.wipro.org.strings;

import java.util.Scanner;

public class Problem05{
        /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	 Scanner  sc = new Scanner(System.in);
	 System.out.println(removefirstLast(sc.next()));
   }

private static String removefirstLast(String str) {
	return (String) str.subSequence(1, str.length()-1);
}
} 
