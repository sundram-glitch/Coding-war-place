package com.wipro.org;
import java.util.Scanner;
public class Problem02 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt(); sc.close();
	  if(n%2==0) System.out.println(n+" is Even number");
	  else System.out.println(n+" is Odd number");
   }
}
