package com.For.Loop;

import java.util.Scanner;

public class Factorial {
   public static void main(String[] args) {
		System.out.println();
	Scanner scanOf=new Scanner(System.in);
	System.out.println("Enter n no to find  factorial");
	int i,fact=1;int n = scanOf.nextInt();
	if(n<0) {
		System.out.println("factorial not possible");
	}
	else {
	for (i= 1; i <=n; i++) {
		fact=fact*i;
	}
	System.out.println(fact);
	}
   } 
}
