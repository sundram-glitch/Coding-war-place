package com.tricky.problems;

public class Guess03 {

	public static void main(String[] args) {
    int j=1;
	/*
	 * while(i<=10) { System.out.println(i); if(i==2 | i==9) {continue;} ++i; }
	 *///while loop is not suitable for this situation
    
	/*
	 * for ( j = 1; j <=10; j++) { if(j==2 | j==9)continue; System.out.println(j); }
	 */	
    for ( j = 1; j<=5; j++) {
		if(j%2!=0)continue;
	System.out.println(j);
    }
    System.out.println("j----->\t"+j);
   }
}
