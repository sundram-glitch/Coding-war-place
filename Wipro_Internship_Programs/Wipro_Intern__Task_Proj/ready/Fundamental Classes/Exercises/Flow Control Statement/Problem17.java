package com.wipro.org;
//problem 17
import java.util.Scanner;
public class Problem17{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
	   public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 int n = sc.nextInt(), reverse = 0;
			 int temp = n;
			 while(n!=0) {
				 int mod = n%10;
				 reverse = reverse * 10 + mod;
				 n /=10;
			 }
			 if(reverse==temp)System.out.println(temp +" is Palindrome");
			 else System.out.println(temp +" not a palindrome");
		   }
}
