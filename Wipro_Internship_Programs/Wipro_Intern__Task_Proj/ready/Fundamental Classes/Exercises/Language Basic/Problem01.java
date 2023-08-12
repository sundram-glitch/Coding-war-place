package com.wipro.org;
//Problem 1: two cmd string args
import java.util.Scanner;
public class Problem01 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();sc.close();
		System.out.println(str1+" Technologies "+str2);
	}
}
