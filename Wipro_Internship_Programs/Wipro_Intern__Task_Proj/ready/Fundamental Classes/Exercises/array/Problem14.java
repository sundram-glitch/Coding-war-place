package com.wipro.org.array;
import java.util.Scanner;
public class Problem14 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int r = sc.nextInt();
	 int c = sc.nextInt();
	 int arr[][] = new int[r][c];
	 for (int i = 0; i < r; i++) 
	   for (int j = 0; j < c ; j++) 
		arr[i][j] = sc.nextInt();
	 int temp = 0;
	 for (int i = 0; i < r; i++) 
		   for (int j = 0; j < c ; j++) 
			temp = Math.max(temp, arr[i][j]);
	 System.out.println(temp);

   }
}
