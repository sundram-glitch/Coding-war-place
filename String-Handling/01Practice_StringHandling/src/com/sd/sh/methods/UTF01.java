package com.sd.sh.methods;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class UTF01 {
 public static void main(String[] args) throws UnsupportedEncodingException {
	List<Number> l = new ArrayList<Number>();
	int a = (int)(3 * 2.5);
	for (int i = 0; i <10 ; i++)
		l.add(i);
		String s ="Hello";
		System.out.println(s.getBytes("utf-8")[2]+" "+s.charAt(2));
		l.add(a,s.getBytes("UTF-8")[2]);
		System.out.println(l);
	}
}
