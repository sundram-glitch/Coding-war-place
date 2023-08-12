package com.wipro.org;
import java.util.Scanner;
public class Problem14 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	  Scanner sc   = new Scanner(System.in);
	  int n  = sc.nextInt(), sum = 0;
	  while(n!=0) {
		  int mod = n %10;
		  sum +=mod;
		  n  /=10;
	  }
	  System.out.println(sum);
   }
}
