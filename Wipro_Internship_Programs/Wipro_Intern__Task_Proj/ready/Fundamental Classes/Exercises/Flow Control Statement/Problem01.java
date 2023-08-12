package com.wipro.org;
import java.util.Scanner;
public class Problem01{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println(lastDigit(sc.nextInt(), sc.nextInt()));
     sc.close();
   }
   static boolean lastDigit(int input1, int input2) {
    	return input2%10==input1?true:false;
   }
}
