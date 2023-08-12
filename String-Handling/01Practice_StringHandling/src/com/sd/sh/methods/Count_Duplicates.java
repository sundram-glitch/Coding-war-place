package com.sd.sh.methods;

import java.util.*;
import java.util.Map.Entry;

public class Count_Duplicates {
 public static void main(String[] args) {
	Map<Character, Integer> map = new TreeMap<Character, Integer>();
	String str = new Scanner(System.in).next().toLowerCase();
    for (int i = 0; i < str.length(); i++) 
		map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
	for(Entry<Character, Integer> etr : map.entrySet())
        System.out.println(etr.getKey()+" "+etr.getValue());
 }
}
