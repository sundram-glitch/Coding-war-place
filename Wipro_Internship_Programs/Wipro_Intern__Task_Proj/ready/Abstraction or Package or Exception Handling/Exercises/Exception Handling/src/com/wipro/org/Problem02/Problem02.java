package com.wipro.org;
import java.util.*;
public class Problem02 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
     public static void main(String[] args) {
	   try(Scanner sc = new Scanner(System.in)){
		   int n = sc.nextInt();
		   int arr [] = new int[n];
		   for (int i = 0; i < arr.length; i++) 
               arr[i] = sc.nextInt();
		      for (int i = 0; i < arr.length; i++) 
		            System.out.println(arr[i]);
	   }
	   catch(IndexOutOfBoundsException ioe) {
		   System.out.println(ioe.getMessage());
	   }
	   catch(InputMismatchException ime){
		   System.out.println(ime.getMessage());
	   }
	   
	 }
}
