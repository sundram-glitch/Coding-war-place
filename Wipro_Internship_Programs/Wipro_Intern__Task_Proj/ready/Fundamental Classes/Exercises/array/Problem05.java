package com.wipro.org.array;
import java.util.*;
public class Problem05{
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
	  Arrays.sort(arr);
	  System.out.println("Two min elements are :"+arr[0]+" and "+arr[1]);
	  System.out.println("Two Max elements are :"+arr[n-1]+" and "+arr[n-2]);
  }
}
