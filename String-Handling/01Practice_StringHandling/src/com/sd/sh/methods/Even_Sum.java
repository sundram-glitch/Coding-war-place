package com.sd.sh.methods;

import java.util.Scanner;

public class Even_Sum {
  public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 int n =scan.nextInt();
	 int arr[] = new int[n];
	 for (int i = 0; i < arr.length; i++) 
		 arr[i] = scan.nextInt();
  System.out.println(check(arr));
  }
  public static int check(int[] arr)
  {
	  int sum = 0, temp = 0;
		 for (int i = 0; i < arr.length; i++) {
		 for (int j = i; j < arr.length; j++) {
		   sum += arr[j];
		 }
		 if(sum%2==0 && sum >temp) {
			 temp = sum;
			 return sum;
		 }
		 else sum =0;
  }
		return sum;
}
}
