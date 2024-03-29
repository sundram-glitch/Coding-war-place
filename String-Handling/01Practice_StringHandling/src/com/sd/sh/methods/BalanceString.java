package com.sd.sh.methods;

import java.util.*;
public class BalanceString {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int T  = sc.nextInt();
	while(T!=0){
	System.out.println(isEqual(sc.next(),sc.next()));
	T--;
	}
  }
   static String isEqual(String s1, String s2) {

	    Set<Character> s1Set = new HashSet<>();
	    Set<Character> s2Set = new HashSet<>();
	    for(char c : s1.toCharArray()) 
	      s1Set.add(c);
	    for(char c : s2.toCharArray()) 
	    	s2Set.add(c);
	    s1Set.retainAll(s2Set);
	    if (!s1Set.isEmpty())
	      return "YES";
	    return "NO";
	  }
}
/*3
abc
def
abc
bca
abcdbc
adxxyy*/