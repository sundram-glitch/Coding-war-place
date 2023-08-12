package com.wipro.org.parsemaxvalue;
import java.util.Scanner;
public class Problem02 {
	 /**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt(); sc.close();
	 System.out.println("Binary Equivalent:"+Integer.toBinaryString(n));
	 System.out.println("Binary Equivalent:"+Integer.toOctalString(n));
	 System.out.println("Binary Equivalent:"+Integer.toHexString(n));
  }
}
