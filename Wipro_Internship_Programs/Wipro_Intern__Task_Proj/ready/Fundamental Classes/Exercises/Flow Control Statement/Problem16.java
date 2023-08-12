package com.wipro.org;
//Problem 16
import java.util.Scanner;
public class Problem16{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt(), reverse = 0;
	 while(n!=0) {
		 int mod = n%10;
		 reverse = reverse * 10 + mod;
		 n /=10;
	 }
	 System.out.println(reverse);
   }
} 
