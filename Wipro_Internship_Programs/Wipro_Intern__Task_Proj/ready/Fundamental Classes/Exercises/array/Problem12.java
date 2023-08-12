package com.wipro.org;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Problem12 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
  public static void main(String[] args) {
	 Scanner sc  = new Scanner(System.in);
	 int n = 3;
	 int arr1[] = new int[n];
	 int arr2[] = new int[n];
	for (int i = 0; i < arr2.length; i++) 
		 arr1[i] = sc.nextInt();
	for (int i = 0; i < arr2.length; i++)
         arr2[i] = sc.nextInt();
	System.out.println(Arrays.toString(midWay(arr1, arr2)));
  }
  static int[] midWay(int[] arr1, int[] arr2) {
	int arr[] = new int[2];
	arr[0] = arr1[1]; arr[1] = arr2[1];
	return arr;
}
}
