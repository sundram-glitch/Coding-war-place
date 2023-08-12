package com.sd.sh.methods;

import java.util.*;

public class Nth_Prime {
  public static void main(String[] args) {
	int n  = new Scanner(System.in).nextInt();
    int temp = n;
	ArrayList<Integer> list = new ArrayList<Integer>();
    int i = 2;
	while(list.size()!=temp) {
        int count = 0;
    	for (int j = 1; j <=i; j++) {
			if(i%j==0) count++;
		}
    	if(count == 2) list.add(i);
    	i++;
	continue;
    } 
    System.out.println(list.get(temp-1));
    }
}
