package com.wipro.org.array;
import java.util.Scanner;
public class Problem02 {
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
	 //finding min elements in arr
	 int min = arr[0], max = arr[0];
	 for (int i = 1; i < arr.length; i++) { 
		min = Math.min(arr[i], min);
	    max = Math.max(arr[i], max);
	 }
	 System.out.println("Min element :"+min +" Max element : "+max);
  }
}
