package com.sd.sh.methods;

import java.util.*;
public class Distinct_Date_Document {
     public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
    	 String str = scan.nextLine();
    	 System.out.println(disctinct_year(str));
	 }
     static int disctinct_year(String str) {
      String str2 ="";
      Set<String> uniqueDates = new HashSet<>();
      for (int i = 0; i < str.length(); i++) { 
    	  if(Character.isDigit(str.charAt(i)))
    		  str2 +=(str.charAt(i));
    	  if(str.charAt(i)=='-') str2 ="";
          if(str2.length()==4) 
        	  uniqueDates.add(str2);
          str2 ="";
      }
		 return uniqueDates.size();
	}
}
