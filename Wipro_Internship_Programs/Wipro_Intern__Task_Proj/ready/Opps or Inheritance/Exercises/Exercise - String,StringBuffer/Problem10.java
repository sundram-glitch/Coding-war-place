package com.wipro.org.strings;
import java.util.Scanner;
public class Problem10 {
	     /**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
    public static void main(String[] args) {
	 try (Scanner sc = new Scanner(System.in)) {
		String str = sc.nextLine();
		 int n  = sc.nextInt();
		 System.out.println(concateNRepoChars(str,n));
	}
	 catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
    }
	 static String concateNRepoChars(String str, int n) {
	     int start = str.length()-n, end  = str.length();
	     String sub = str.substring(start, end);
         String res = "";
         int temp = n;
	     while(temp!=0) {
        	  res +=sub;  
	    	 temp--;
           }
		 return res;
     }
}
