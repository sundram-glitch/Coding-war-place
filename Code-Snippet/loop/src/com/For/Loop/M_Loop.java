package com.For.Loop;

import java.util.Scanner;

public class M_Loop {

	public static void main(String[] args) {
		Scanner scanOf=new Scanner(System.in);
	    System.out.println("Enter an Integer");
		int n=scanOf.nextInt();
		for (int r = 1; r <=n; r++) {
			int i=1;
			for (int c1 = 1; c1 <=r; c1++) {
				System.out.print(i++);
			//System.out.print("*");
			}
			
			for (int s = 1; s <=n-r; s++) {
				System.out.print("  ");//double spaces very imp program
			}
			int j=--i;
			for (int c1 = 1; c1 <=r; c1++) {
				System.out.print(j--);
			//System.out.print("*");
			}
			System.out.println();
		}
		scanOf.close();
	}

}
