package com.wipro.org;
import java.util.*;
public class Problem05 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
   public static void main(String[] args) {
	 Scanner sc  = new Scanner(System.in);
	 char ch =  sc.next().charAt(0);
	 if((int)ch>96 && (int)ch<123)
		 System.out.println("Alphbhet");
	 else if((int)ch>47 && (int)ch<57)
		 System.out.println("Digit");
	 else System.out.println("Special Character");
   }
}
