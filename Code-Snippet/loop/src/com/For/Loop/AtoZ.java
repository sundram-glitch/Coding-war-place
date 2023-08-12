package com.For.Loop;

import java.util.Scanner;

public class AtoZ {

	public static void main(String[] args) {
		/*
		 * 
		 */
		char ch='h';
		for (int i = 1; i <=1; i++) {
	for (int j = 1; j <=26; j++) {
	System.out.print((ch=(char) (64+j))+"\t");
	
	  if(j==4 | j==4*2 | j==4*3 | j==4*4 | j==4*5 ) { 
		  System.out.println(); }//if
	 	}//nestedfor	
	System.out.println();
	}//outerfor
	}
}
