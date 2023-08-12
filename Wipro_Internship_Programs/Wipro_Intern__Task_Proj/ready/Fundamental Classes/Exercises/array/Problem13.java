package com.wipro.org.array;
import java.util.*;
public class Problem13 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int arr[][] = new int[n][n];
	 for (int i = 0; i < n; i++) 
        for (int j = 0; j < n; j++) 
               arr[i][j] = sc.nextInt();
	      int  end = n-1, k = end;
	      for (int i = 0; i < arr.length; i++) {
			 for (int j = 0; j < arr.length && i<k; j++) {
				 int temp = arr[i][j];
			     arr[i][j] = arr[k][end-j];
			     arr[k][end-j] = temp;
			 }
			 k--;
		  }
	      for (int i = 0; i < arr.length; i++) { 
	    	  for (int j = 0; j < arr.length; j++)  
	      System.out.print(arr[i][j]+" ");
	      System.out.println();
	      }
	 }  
}
