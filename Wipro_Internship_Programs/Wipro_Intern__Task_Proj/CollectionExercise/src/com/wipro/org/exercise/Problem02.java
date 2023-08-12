package com.wipro.org.exercise;
import java.util.*;
public class Problem02 {
   public static void main(String[] args) {
	  try(Scanner sc = new Scanner(System.in)){
		  ArrayList list = new ArrayList();
		  String input = sc.nextLine();
		  if(isNumeric(input))list.add(input);
		  System.out.println(list);
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
   }
public static boolean isNumeric(String strNum) {
    if (strNum == null || strNum.isBlank() ) 
        return false;
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
}