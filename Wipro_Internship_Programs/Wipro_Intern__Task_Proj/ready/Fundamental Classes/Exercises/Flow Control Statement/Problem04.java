package com.wipro.org;
import java.util.*;
public class Problem04{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String ch1 = sc.next(); sc.close();
	 String ch2 = sc.next();
	 String str = ""+ch1+ch2;
	 char chArr[] =  str.toCharArray();
	 Arrays.sort(chArr);
	 System.out.println(Arrays.toString(chArr));
   }
}
