package com.wipro.org.array;
import java.util.Scanner;
public class Problem08{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    int  n = sc.nextInt();
    int arr[] = new int[n];
	  for (int i = 0; i<n; i++) 
             arr[i] = sc.nextInt();
	  int f = sc.nextInt(), s = sc.nextInt();
	  int sum = 0, tempSum = 0;
	  boolean flag = true;
	  for (int i = 0; i < n; i++) {
	    if(arr[i]!=6 && flag) 
	    	sum +=arr[i];
	    else flag = false;
	    if(arr[i]!=7 && flag == false) 
	    	tempSum += arr[i];
	    else flag = true;
      }
	  if(flag)
	  System.out.println(sum);
	  else System.out.println(sum+tempSum);
  }
}
