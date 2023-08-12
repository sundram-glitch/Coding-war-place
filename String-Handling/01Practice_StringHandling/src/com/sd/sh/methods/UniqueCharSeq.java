package com.sd.sh.methods;

import java.util.Scanner;

public class UniqueCharSeq {
    static int i,j,k,count;
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
    System.out.print("Enter a String: "); 
    String str = scn.nextLine();
    char [] a=str.toCharArray();
    /*for (int i = 0; i < a.length; i++) 
    System.out.print(a[i]+" ");*/
    char [] b=new char[128];
    for (i = 0;  i< a.length; i++) {
		for ( j = 1+i, count =i+1; j < a.length; j++,count++) {
			if(i<a.length-2 && a[i]!=a[j]) {  
			//	System.out.print(count+" ");
			if(count==a.length-1)
				b[k++] = a[i];
			}//outer if
		  }//for
		}//for
    System.out.println(count);
    for (int i = 0; i <=count; i++) System.out.print(b[i]);
	}//main
}//class

