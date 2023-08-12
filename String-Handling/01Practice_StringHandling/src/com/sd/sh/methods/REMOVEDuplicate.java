package com.sd.sh.methods;

import java.util.Arrays;
import java.util.Scanner;

public class REMOVEDuplicate {
 public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int M = scan.nextInt();
	String [][] str= new String[N][M];
	for (int i = 0; i < str.length; i++) 
		for (int j = 0; j < str.length; j++) 
			str[i][j] =scan.next();
	for (int i = 0; i < str.length; i++) {
		for (int j = 0; j < str.length; j++) {
			System.out.print(str[i][j]);
		}
	System.out.println();
	}try {
		for (int i = 0; i < str.length; i++) {
			int count  = 0;
			int j = 0;
		for (j = 0; j < str.length; j++) {
			if(str[i][j].contains(".")) {
				str[i][j]=str[i][j].replace(".","");
				count++;
			}
				}
		System.out.println(j+" "+count);
		if(count==j && i!= str.length-1) {
			for (int k = 0; k < str.length; k++) {
				str[i][k] = str[i+1][k];
				str[i+1][k] ="";
			}
			i--;
		}
	}
	}catch(Exception e) {
		System.out.println(e);
	}
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if(str[i][j].equals("")) continue;
				System.out.print(str[i][j]);
			}
			if(i==str.length-1)break;
			System.out.println();
		}
 }
}