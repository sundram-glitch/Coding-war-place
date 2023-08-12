package com.wipro.org;
import java.util.Scanner;
//problem 15
public class PintNPattern {
   public static void main(String[] args) {
	int n = new Scanner(System.in).nextInt();
	for (int i = 1; i <=n; i++) {
	  for (int j = 1; j <=i; j++) 
		 System.out.print("* ");
	  System.out.println();
	}
   }
}
