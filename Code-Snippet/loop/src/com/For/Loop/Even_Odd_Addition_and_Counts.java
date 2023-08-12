package com.For.Loop;

import java.util.Scanner;

public class Even_Odd_Addition_and_Counts {
       public static void main(String[] args) {
	   Scanner scanOf=new Scanner(System.in);
	   System.out.println("Enter a no");
	   int n=scanOf.nextInt();int esum=0,ecount=0,osm=0,ocount=0;
	   for (int i = 1; i <=n; i++) {
		if(i%2==0) {
			System.out.println();
			esum=esum+i;
			ecount=ecount+1;
		}
		else {
			System.out.println();
			osm=osm+i;
			ocount=ocount+1;
		}
	   }
	    System.out.println("\tesum:\t"+esum+"\tecount:\t"+ecount);
		System.out.println();
		System.out.println("\tosm:\t"+osm+"\tocount:\t"+ocount);
     }
}
