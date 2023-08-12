package com.wipro.org.array;
import java.util.*;
public class Problem07 {
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
	   int size = 0, inc = 0;
	   for (int i = 0; i < arr.length-1; i++) 
			if(arr[i]!=arr[i+1]) size++;
	   int uniarr[] = new int[size+1];
	   for (int i = 0; i < arr.length-1; i++) 
             if(arr[i]!=arr[i+1])uniarr[inc++] = arr[i];
	   uniarr[inc] = arr[arr.length-1];
	   System.out.println(Arrays.toString(uniarr));
	 }
}
