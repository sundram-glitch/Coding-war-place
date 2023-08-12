package com.For.Loop;

import java.util.Scanner;

public class Pattern_Of_Regular_Alphabet {

	public static void main(String[] args) {
		Scanner scanOf=new Scanner(System.in);
		 System.out.println("enter rows n cols no"); int c=0,
		 nr=scanOf.nextInt(),nc=scanOf.nextInt();
         for (int i = 1; i <=nr; i++) {
		 for (int  j= 1; j <= nc; j++) {
				if(i%2==0)//or logic-> if(i%2) A B C D \n a b c d  .................
					System.out.print(((char)(96+j))+" ");//-> i--j
				else
					System.out.print(((char)(64+j))+" ");//-> i->j
		}//nested for
	  System.out.println();
	}//outer for
  }//main
}//c