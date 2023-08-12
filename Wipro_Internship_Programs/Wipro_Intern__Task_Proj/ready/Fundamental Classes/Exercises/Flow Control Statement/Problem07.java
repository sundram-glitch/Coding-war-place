package com.wipro.org;
import java.util.Scanner;
public class Problem07 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
    public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  char ch = sc.next().charAt(0);
	  if(ch>96 && ch<122)System.out.println(Character.toUpperCase(ch));
	  else System.out.println(Character.toLowerCase(ch));
	}
}
