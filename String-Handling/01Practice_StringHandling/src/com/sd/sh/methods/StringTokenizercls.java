package com.sd.sh.methods;
import java.util.*;
public class StringTokenizercls {
  public static void main(String[] args) {
	  System.out.println("Enter String ");
	Scanner scan =  new Scanner(System.in);
	  String  str =	 scan.nextLine();  
   StringTokenizer  token = new StringTokenizer(str,"[aeiou]");
   System.out.println(token.countTokens());
   System.out.println(token.nextElement());
}
}
