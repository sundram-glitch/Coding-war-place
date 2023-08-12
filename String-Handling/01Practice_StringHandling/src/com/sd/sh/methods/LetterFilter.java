package com.sd.sh.methods;

import java.util.Scanner;

public class LetterFilter {
    public LetterFilter(String text) {
	System.out.println(filter_vowels(text));	
	System.out.print(filter_constants(text));
    }
    
private StringBuffer filter_constants(String text) {
		
	    StringBuffer bf = new StringBuffer(text);
		for (int i = 0; i < bf.length(); i++) {
	    for (int j = i; j < bf.length(); j++)
		if(text.charAt(j)!='a' && text.charAt(j)!='e'  && text.charAt(j)!='i'  && text.charAt(j)!='o'  && text.charAt(j)!='u')
		bf.deleteCharAt(j);
		}
			return (StringBuffer) bf;
	}

private String filter_vowels(String text) {
		String str2 = null;
		for (int i = 0; i < text.length(); i++) {
			if(text.contains("a") | text.contains("e") | text.contains("i") | text.contains("o") | text.contains("u")) {
		    str2 =	text.replaceAll("[aeiou]", "");
			}
		}
		return str2;
	}

public static void main(String[] args) {
 Scanner get = new Scanner(System.in);
 String str = get.next();
 LetterFilter filter = new LetterFilter(str);
 }
}
