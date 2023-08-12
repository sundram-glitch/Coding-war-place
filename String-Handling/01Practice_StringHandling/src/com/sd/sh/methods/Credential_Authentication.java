package com.sd.sh.methods;
public class Credential_Authentication {
 public static void main(String[] args)throws Exception {
	 java.util.Scanner scn = new java.util.Scanner(System.in);
	String pwd =scn.next();
    if(isValid(pwd)) System.out.print("Valid");
    else System.out.print("Invalid");
}
private static boolean isValid(String pwd) {
	if (!((pwd.length() >= 10) && (pwd.length() < 32)))return false;
	if (pwd.contains(" ")) return false;
	if (true) {
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            String str1 = Integer.toString(i);
            if (pwd.contains(str1)) count = 1;
        }
        if (count == 0) return false;
    }if (!(pwd.contains("@") || pwd.contains("#")
              || pwd.contains("!") || pwd.contains("~")
              || pwd.contains("$") || pwd.contains("%")
              || pwd.contains("^") || pwd.contains("&")
              || pwd.contains("*") || pwd.contains("(")
              || pwd.contains(")") || pwd.contains("-")
              || pwd.contains("+") || pwd.contains("/")
              || pwd.contains(":") || pwd.contains(".")
              || pwd.contains(", ") || pwd.contains("<")
              || pwd.contains(">") || pwd.contains("?")
              || pwd.contains("|"))) 
            return false;
	  if (true) {
          int count = 0;
             for (int i = 65; i <= 90; i++) {
                char c = (char)i;
              String str1 = Character.toString(c);
              if (pwd.contains(str1))count = 1;
              }
          if (count == 0) return false;
      }
	  if (true) {
          int count = 0;
          for (int i = 90; i <= 122; i++) {
              char c = (char)i;
              String str1 = Character.toString(c);
              if (pwd.contains(str1))count = 1;
          }
          if (count == 0) return false;      
      }
	  int count=0, l = pwd.length();
	  for (int i = 0; i < l; i++,count=0) {
	      for (int j = i + 1; j < l; j++) {
	        if (pwd.charAt(i) == pwd.charAt(j)) {
	          count++;
	          j--;
	          l--;
	        }
	      }
	      if (count > 0) {
	        i--;
	        l--;
	        return false;
	      }
	   }
	  return true;
   }
}
