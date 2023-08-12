package com.wipro.org.array;
import java.util.*;
public class Problem09 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
  public static void main(String[] args) {
	 Scanner  sc = new Scanner(System.in);
	 int n  = sc.nextInt();
	 int arr[] = new int[n];
	 for (int i = 0; i < n; i++) 
         arr[i] = sc.nextInt();
	 for (int i = 0; i < n; i++)
		if(arr[i]==10) {
			arr[i] = arr[i+1];
			arr[i+1] = 0;
			i--;
	   }
	 int newArr[] = new int[n];
	 int len = arr.length-1, inc = 0;
	 for (int i = 0; i < arr.length; i++) 
       if(arr[i]!=0) newArr[inc++] = arr[i];
	 else newArr[len--] = 0; 
	 System.out.println(Arrays.toString(newArr));
  }
}
