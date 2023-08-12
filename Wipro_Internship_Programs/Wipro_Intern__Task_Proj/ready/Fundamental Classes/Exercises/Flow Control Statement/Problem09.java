package com.wipro.org;
import java.util.Scanner;
public class Problem09{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
 	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     String strArr[] = {"January", "Febraury", "March", "April", "May", "July", 
    	              "August", "Septemeber", "October", "November", "December"};
     if(n>12)System.out.println("Invalid Month");
     else System.out.println(strArr[n-1]);
 	}

}
