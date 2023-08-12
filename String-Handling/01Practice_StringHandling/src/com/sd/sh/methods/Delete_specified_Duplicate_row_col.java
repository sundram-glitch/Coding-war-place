package com.sd.sh.methods;

import java.util.Scanner;

public class Delete_specified_Duplicate_row_col {
   static char ch[][] =null;
   static int rows = 0, cols = 0;
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int M = sc.nextInt();	
	char key = sc.next().charAt(0);
	ch= new char[N][M];
	for (int i = 0; i < ch.length; i++)for (int j = 0; j < ch.length; j++)ch[i][j]=sc.next().charAt(0);
	for (int i = 0; i < ch.length; i++) {
		for (int j = 0; j < ch.length; j++) System.out.print(ch[i][j]);
	System.out.println();
	}
	for (int i = 0; i < ch.length; i++) {
		int count = 0;
		for (int j = 0; j < ch.length; j++) {
			if(ch[i][j]!= key && i == 0) break;
			if(ch[i][j]!=key)break;
			else count++;
			if(count==ch.length) {
				rows++;
				row(i);
				if(i != ch.length-1) i--;
			}
		}
	}
	for (int i = 0; i < ch.length-rows; i++) {
		int count = 0;
		for (int j = 0; j < ch.length; j++) {
			if(ch[j][i]!= key && j == 0) break;
			else if(ch[j][i]!= key)break;
			else count++;
			if(count==ch.length) {
				cols++;
				col(i);
				if(i != ch.length-1) i--;
			}
			}
	}
	for (int i = 0; i < ch.length-rows; i++) {
		for (int j = 0; j < ch.length-cols; j++) 
		System.out.print(ch[i][j]);
		System.out.println();
	}
    }
    static void row(int row) {
    	for (int i = row; i < ch.length-1; i++)
		 for (int j = 0; j < ch.length; j++) ch [i][j] = ch[i+1][j];
    }
 	static void col(int col) {
 			for (int k = col; k < ch.length-1; k++)
 			for (int j = 0; j < ch.length-rows; j++) ch[j][k] = ch[j] [k+1];
 	}
}
