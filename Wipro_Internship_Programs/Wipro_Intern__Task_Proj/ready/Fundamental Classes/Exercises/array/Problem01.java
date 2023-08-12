package com.wipro.org.array;
import java.util.Scanner;
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
public class Problem01 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int ar[] = new int[n],sum = 0;
	for (int i = 0; i < ar.length; i++) 
       ar[i] = sc.nextInt();
	for (int i = 0; i < ar.length; i++) sum +=ar[i];
	System.out.println("sum of given arr elements : "+sum+"\nAverage of given array elements :"+ sum/n);
   }
}