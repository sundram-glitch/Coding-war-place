package com.wipro.org;
import java.util.Scanner;
public class Problem03 {
	 /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
  public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt(); sc.close();
	 String str = null;
	 if(n>0 && n<256) str = Integer.toBinaryString(n);
     while(str.length()<8) str = 0+str;
     System.out.println(str);
  }
}
