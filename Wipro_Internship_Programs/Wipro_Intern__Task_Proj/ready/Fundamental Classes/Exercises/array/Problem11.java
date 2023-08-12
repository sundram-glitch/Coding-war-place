package com.wipro.org.array;
import java.util.*;
public class Problem11 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n =sc.nextInt();
	 int arr [] = new int [n];
	 for (int i = 0; i < arr.length; i++) 
         arr[i] = sc.nextInt();
	 boolean flag = false;
	 for (int i = 0; i < arr.length; i++) 
	   if(arr[i] == 4 || arr[i] == 1) flag = true;
	   else {
		   flag = false;
		   break;
	   }
	   System.out.println(flag);
   }
}
