package com.wipro.org;
import java.util.Scanner;
public class Problem10{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt(), count = 0;
	  for (int i = 1; i <=n; i++) 
		  if(n%i==0)count++;
	  if(count==2) System.out.println(n +" is Prime no");
	  else System.out.println( n +" Not a prime no");
   }
}
