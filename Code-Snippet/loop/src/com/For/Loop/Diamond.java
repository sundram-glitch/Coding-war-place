package com.For.Loop;

import java.util.Scanner;

public class Diamond{

	public static void main(String[] args){
	Scanner  scanOf=new Scanner(System.in);
	System.out.println("Enter n integer");
	int n=scanOf.nextInt();
/*    for (int r = 1; r <=n; r++) {
		for (int s = 1; s <=n-r; s++) {
			System.out.print(" ");
		}
		for (int c = 1; c <=2*r-1; c++) {
		System.out.print("*");	
		}
		System.out.println();
	}
    for (int r = n; r>=1; r--) {
 		for (int s = 1; s <=n-r; s++) {
 			System.out.print(" ");
 		}
 		for (int c = 1; c <=r*2-1; c++) {
 		System.out.print("*");	
 		}
 		System.out.println();
 	}*/
/*    for (int r = 1; r <=n; r++) {
    	
		for (int s = 1; s <=n-r; s++) {
			System.out.print(" ");
		}
		for (int c = 1; c <=2*r-1; c++) {
		System.out.print(c);	
		}
		System.out.println();
	}
    for (int r = n; r>=1; r--) {
 		for (int s = 1; s <=n-r; s++) {
 			System.out.print(" ");
 		}
 		for (int c = 1; c <=r*2-1; c++) {
 		System.out.print(c);	
 		}
 		System.out.println();
*/
/*    for (int r = 1; r <=n; r++) {
    	
		for (int c = 1; c <=2*r-1; c++) {
		System.out.print("*");	
		}
		System.out.println();
	}
    for (int r = n; r>=1; r--) {
 		for (int c = 1; c <=r*2-1; c++) {
 		System.out.print("*");	
 		}
 		System.out.println();
    }
*//* 		for (int r = 1; r <=n; r++) {
 	    	
 			for (int c = 1; c <=2*r-1; c++) {
 			System.out.print(c);	
 			}
 			System.out.println();
 		}
 	    for (int r = n; r>=1; r--) {
 	 		for (int c = 1; c <=r*2-1; c++) {
 	 		System.out.print(c);	
 	 		}
 	 		System.out.println();
*/
    
/*
 * for (int r = 1; r<=n; r++) {
 * 
 * for (int s = 1; s <=n-r; s++) { System.out.print(" "); }
 * 
 * for (int c = 1; c <=2*r-1; c++) { System.out.print("*"); }
 * System.out.println(); } for (int r = n; r>=1; r--) {
 * 
 * for (int s =1; s <=n-r; s++) { System.out.print(" "); }
 * 
 * for (int c = 1; c <=r*2-1; c++) { System.out.print("*"); }
 * System.out.println(); }
 */
    for (int r = 1; r<=n; r++) {
		
		for (int s = 1; s <=n-r; s++) System.out.print("  "); 
		
		for (int c = 1; c <=2*r-1; c++) System.out.print("@");

	
		System.out.println();
	}
    for (int r = n-1; r>=1; r--) {
    	
    	for (int s =1; s <=n-r; s++) System.out.print("  "); 
  
    	for (int c = 1; c <=r*2-1; c++) System.out.print("@");	
    	
    	System.out.println();
    }

	scanOf.close();
	}
 
}