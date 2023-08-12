package com.sd.sh.methods;

import java.util.Scanner;

public class Last_Str_len {
  public static void main(String[] args) {
   String str = new Scanner(System.in).nextLine();
   String [] strArr = str.split(" ");
   String count = strArr[strArr.length-1];
   System.out.print(count.length());
}
}
