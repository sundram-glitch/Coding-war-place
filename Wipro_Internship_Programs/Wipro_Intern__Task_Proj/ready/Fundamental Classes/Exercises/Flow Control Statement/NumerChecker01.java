package com.wipro.org;
import java.util.Scanner;
public class NumerChecker01 {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(n>0) System.out.println(n+" is positive");
	else if(n<0) System.out.println(n+" is negative");
	if(n==0) System.out.println(n+" is zero");
   }
} 
