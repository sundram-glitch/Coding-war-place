package com.wipro.org;
import java.util.*;
public class Problem03{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	if(str.equals("") || str.equals(" "))
		System.out.println("No values");
	else {
		String arr[] = str.split(" ");
		System.out.println(Arrays.toString(arr));
	}
   }
}
