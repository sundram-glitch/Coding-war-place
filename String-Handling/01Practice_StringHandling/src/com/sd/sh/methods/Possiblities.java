package com.sd.sh.methods;

import java.util.*;
public class Possiblities {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
	 int T = sc.nextInt();
	 int N = sc.nextInt();
	 int K = sc.nextInt();
	 while(T!=0) {
		 isPossible(N,K);
		 T--;
	 }
  }
   static String isPossible(int n, int k) {
	int arr[][] = new int[n][k];
	Set<Integer> map = new LinkedHashSet<>();
	int K [] = new int[k];
	for (int i = 0; i < arr.length; i++) 
		K[i] = sc.nextInt();
	for (int i = 0; i < n; i++) 
		for (int j = 0; j< k; j++)
			arr[i][j] = sc.nextInt();
		for (int i = 0; i < n; i++)
		for (int j = 0; j < arr.length; j++) {
			if(arr[i][j]!=K[j]) continue;
			return "No";
		}
		return "Yes";
   } 
}
