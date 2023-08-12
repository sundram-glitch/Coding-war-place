package com.wipro.org.array;
import java.util.Scanner;
public class Problem03{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for (int i = 0; i < arr.length; i++) 
      arr[i]  = sc.nextInt();
	int k = sc.nextInt();
	for (int i = 0; i < arr.length; i++)  
         if(arr[i]==k) {
        	 System.out.println(i);
         return;
         }
	System.out.println(-1);
   }
}
