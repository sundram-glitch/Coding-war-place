package com.wipro.org;
public class Problem13 {
	/**
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/
    public static void main(String[] args) {
	 for (int i = 10; i <=99; i++) {
		 int count = 0;
		for (int j = 1; j <=i; j++) 
			if(i%j==0)count++;
	 if(count==2) System.out.println(i);
	 }	
	}
}
