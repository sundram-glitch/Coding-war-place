package com.sd.sh.methods;

import java.util.Scanner;

public class RetrunUniqueChars {
    private static final int CHAR_RANGE = 128;
    //Function to find the longes substring with all 
    //distinct character using a sliding window	
    public static String findLongestSubstring(String str) {
    //boolean arrays to mark characters present in th current window
    boolean [] win = new boolean[CHAR_RANGE];
    //Stores the longest substring boundries
    int begin =0, end = 0;
    //[low...high] maintain the sliding win boundries
    for (int high = 0,low =0; high < str.length(); high++) {
	//if the current character is present in the current window
    	if(win[str.charAt(high)]) {
    		System.out.println(win[str.charAt(high)]);
    //remove characters the current charater
    		while(str.charAt(low)!=str.charAt(high)) {
    			 win[str.charAt(low)]=false;
    			 low++;
    		}
    		low++;
    	}
    else {
    //if the current character is not present in the current window include it
    	win[str.charAt(high)] = true;
    //update the maximum window size if neccessary
    	if(end - begin < high - low) {
    		begin = low;
    		end = high;
    	}
    } 
    }
    //return the longest substring found at str[begin....end]
    return str.substring(begin,end+1);
    }
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);	
	System.out.println(findLongestSubstring(scn.next()));
	}
}
