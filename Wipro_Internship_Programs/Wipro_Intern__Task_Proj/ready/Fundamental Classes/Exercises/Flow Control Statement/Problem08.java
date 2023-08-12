package com.wipro.org;
//problem 8: Color Code
import java.util.Scanner;
public class Problem08{
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 char ch = sc.next().charAt(0);
	 String strArr[]  = {"Red", "Blue", "Green", "Orange", "Yellow", "White"};
     String res = "";	 
	 for (int i = 0; i < strArr.length; i++) 
        if(ch==strArr[i].charAt(0))res = strArr[i];
	 if(res.isBlank())System.out.println("Invalid input");
	 else System.out.println(res);
  }
}
