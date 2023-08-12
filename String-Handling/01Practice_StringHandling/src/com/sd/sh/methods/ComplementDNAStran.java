package com.sd.sh.methods;

import java.util.Scanner;

public class ComplementDNAStran {
  public static void main(String[] args) {
  String str = new Scanner(System.in).next();
  char ch1 = 'A', ch2 = 'T', ch3 = 'C', ch4 = 'G';
  StringBuffer sb = new StringBuffer(str);
  sb.reverse();
  str = "";
  for (int i = 0; i < sb.length(); i++) {
	switch(sb.charAt(i)) {
	case 'A' :  str  +="T";
	break;
	case 'T' :  str  +="A";
	break;
	case 'G' :  str  +="C";
	break;
	case 'C' :  str  +="G";
	break;
	}
  }
  System.out.println(str);
  }
}
