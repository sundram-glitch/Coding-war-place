package cpa20;

import java.util.*;
public class maxmod {
  public static void main(String[] args) {
	 Scanner  sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int arr[] = new int[n];
	 for (int i = 0; i < arr.length; i++) 
        arr[i] = sc.nextInt();
	 Arrays.sort(arr);
	 int max = Integer.MIN_VALUE, temp = 0;
	 for (int i = 0; i < arr.length-1; i++) {
	    	temp = arr[i]%arr[i+1];
		 if(temp>max)max = temp;
	 }
	 System.out.println(max);
  }
}
