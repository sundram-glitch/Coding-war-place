package com.wipro.org.cls;
import java.util.Scanner;
public class Power02 {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	  Scanner sc =  new Scanner(System.in);
	   int num1 = sc.nextInt(), num2 = sc.nextInt();
	   System.out.println((int)powerInt(num1, num2));
	   System.out.println((double)powerInt(num1, num2));       
   }
   static int powerInt(int num1, int num2) {
	return (int)Math.pow(num1, num2);
   }
   static double powerInt(double num1, double num2) {
	   return Math.pow(num1, num2);
   }
   
}
