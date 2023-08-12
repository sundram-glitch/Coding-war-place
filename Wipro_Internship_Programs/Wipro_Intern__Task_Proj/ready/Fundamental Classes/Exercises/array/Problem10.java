package com.wipro.org.array;

import java.util.Arrays;
import java.util.Scanner;
public class Problem10{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int arr[] = new int[n];
	 for (int i = 0; i < arr.length; i++) 
         arr[i] = sc.nextInt();
     int len = n-1, bg = 0;
     int newArr[] = new int[n];
	 for (int i = 0; i < n; i++) {
		if(arr[i]%2==0) newArr[bg++] = arr[i];
		else newArr[len--] = arr[i];
	 }
	 System.out.println(Arrays.toString(newArr));
  }
}
