package com.sd.sh.methods;

import java.util.*;

public class Count_Special_Chars {
   public static void main(String[] args) {
	String str = new Scanner(System.in).next();
	System.out.println(count_Check(str));
   }
   private static int count_Check(String str) {
    Map<Character,Integer> add = new LinkedHashMap<Character, Integer>();
	for (int i = 0; i < str.length(); i++)
    add.put(str.charAt(i), add.getOrDefault(str.charAt(i), 0)+1);		
			if(add.get('#')>add.get('*')) return -1;
			else if(add.get('*')> add.get('#')) return 1;
			return 0;
   }
}
