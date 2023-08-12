package com.wipro.org.array;

import java.util.Arrays;
import java.util.Scanner;
public class Problem06 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
     public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int arr[]  = new int[n];
	   for (int i = 0; i < arr.length; i++) 
           arr[i] = sc.nextInt();
	   for (int i = 0; i < arr.length; i++) 
		  for (int j = i+1; j < arr.length; j++) 
			 if(arr[i]>arr[j]) {
				 int temp = arr[j];
				 arr[j] = arr[i];
				 arr[i] = temp;
			 }
	 System.out.println(Arrays.toString(arr));  
     }
}
