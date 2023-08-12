package com.sd.sh.methods;

import java.util.Scanner;

public class CountOccurances {
	public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
 
    /* Counts how many times the substring appears in the larger string. */
    public static int countMatches(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
 
        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count ++;
                index += str.length();
            }
            else {
                break;
            }
        }
        if(count==0)
        return -1;
        return count;
    }
 
    public static void main(String[] args)
    {
        Scanner scanf=new Scanner(System.in);
        int n=scanf.nextInt();
        String text;
        String str = "gfg";
        while(n!=0){
        text = scanf.next();
 
        int count = countMatches(text, str);
        System.out.println(count);
        n--;
            
        }
}
}
//geefgfgksforgfgeeks
//dsajslsdlsfgf