package com.For.Loop;

import java.util.Scanner;

public class Regular_Printer {  
   
	public static void main(String[] args) {
	//#Test01
		/*
		 * Scanner scanOf=new Scanner(System.in);
		 * System.out.println("Enter no for rows n cols"); int
		 * nr=scanOf.nextInt(),nc=scanOf.nextInt(); for (int r = 1; r <=nr; r++) { for
		 * (int c = 1; c <=nc; c++) { System.out.print(((char)(64+c))+" "); }//nested
		 * loop }//outer loop
		 */  
	//#Test02
		/*
		 * Scanner scanOf=new Scanner(System.in);
		 * System.out.println("Enter no for rows n cols"); int
		 * nr=scanOf.nextInt(),nc=scanOf.nextInt(); for (int r = 1; r <=nr; r++) { for
		 * (int c = 1; c <=nc; c++) { System.out.print(((char)(64+r))+"\t"); }//nested
		 * loop System.out.println(); }//outer loop
		 */
	//#Test03
		/*
		 * Scanner scanOf=new Scanner(System.in);
		 * System.out.println("Enter no for rows n cols"); int
		 * nr=scanOf.nextInt(),nc=scanOf.nextInt(); for (int r = 1; r <=nr; r++) { for
		 * (int c = 1; c <=nc; c++) { if(c%2==0) System.out.print(((char)(96+c))+"\t");
		 * else System.out.print(((char)(64+c))+"\t"); }//nested loop
		 * System.out.println(); }//outer loop
		 */
	//#Test04
		/*
		 * Scanner scanOf=new Scanner(System.in);
		 * System.out.println("Enter no for rows n cols"); int
		 * nr=scanOf.nextInt(),nc=scanOf.nextInt(); for (int r = 1; r <=nr; r++) { for
		 * (int c = 1,a=96+r; c <=nc; c++) { System.out.print((char)(a++)+"\t");
		 * }//nested loop System.out.println(); }//outer loop
		 * 
		 */
	//#Test05
		/*
		 * Scanner scanOf=new Scanner(System.in);
		 * System.out.println("Enter no for rows n cols"); int
		 * nr=scanOf.nextInt(),nc=scanOf.nextInt(); for (int r = 1; r <=nr; r++) {
		 * for(int c = 1,a=96+r; c <=nc; c++) { if(r%2==0)
		 * System.out.print((char)(96+r)); else System.out.print((char)(64+r));
		 * }//nested loop System.out.println(); }//outer loop
		 */
	//#Test06
		/*
		 * Scanner scanOf=new Scanner(System.in);
		 * System.out.println("Enter no for rows n cols"); int U=97,L=65,
		 * nr=scanOf.nextInt(),nc=scanOf.nextInt(); for (int r = 1; r <=nr; r++) {
		 * for(int c = 1; c <=nc; c++) { if(r%2==0) System.out.print((char)(U)); else
		 * System.out.print((char)(L)); if(r%2==0) U++; else L++; }//nested loop
		 * System.out.println(); }//outer loop
		 */
	//#Test07
	/*
	 * Scanner scanOf=new Scanner(System.in);
	 * System.out.println("Enter no for rows n cols"); int L=97,U=65,
	 * nr=scanOf.nextInt(),nc=scanOf.nextInt(); for (int r = 1; r <=nr; r++) {
	 * for(int c = 1; c <=nc; c++) { if(r%2==0) System.out.print((char)(L)); else
	 * System.out.print((char)(U)); }//nested loop if(r%2==0) L++; else U++;
	 * System.out.println(); }//outer loop
	 */
		 
	//	scanOf.close();
	}//main
}//class
