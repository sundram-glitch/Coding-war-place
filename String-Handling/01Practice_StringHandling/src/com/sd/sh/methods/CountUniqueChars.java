package com.sd.sh.methods;

import java.util.Scanner;

public class CountUniqueChars {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    getvalues(s1);
  }

  public static void getvalues(String s1) {
    String s2 = s1.toLowerCase();
    StringBuffer sb = new StringBuffer(s2);
    boolean flag = false;
    for (int i = 0; i < sb.length(); i++,flag=false) {
      for (int j = i + 1; j < sb.length(); j++) {
        if (sb.charAt(i) == sb.charAt(j)) {
          sb.deleteCharAt(j);
          flag = true;
          j--;
        }
      }
      if (flag) {
        sb.deleteCharAt(i);
        i--;
      }
    }
    if (sb.length() == 0) 
      System.out.println(-1);
    else
      System.out.println(sb.length());
    System.out.println(sb);
  }
}