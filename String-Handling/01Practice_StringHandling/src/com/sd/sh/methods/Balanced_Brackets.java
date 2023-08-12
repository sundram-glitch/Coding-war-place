package com.sd.sh.methods;

import java.util.*;

public class Balanced_Brackets {
   
	static boolean areBalanced(String str) {
		//Using ArraysDeque is faster than using Stack class
		Deque<Character> stack = new ArrayDeque<Character>();
		//Traversing the Expression
		for (int i = 0; i < str.length(); i++) {
		 char x = str.charAt(i); 
		 if(x == '['||x == '{' || x ==  '(') {
			 stack.push(x);
			 continue;
		 }
		 /*stack.add('9');
		 stack.remove('9');*/
		 //if current character is not opening bracket then it must be closing.
		 //So stack can'nt be empty at this point.
		 if(stack.isEmpty()) return false;
		 char check;
		 switch(x) {
		 case ')':check = stack.pop();
		           if(check == '}' || check ==  ']') return false;
		           break;
		 case '}':check = stack.pop();
		           if(check == ')' || check == ']') return false;
		           break;
		 case ']':check = stack.pop();
		           if(check == '}' || check == ')') return false;
		           break;
		 }
		}
		return (stack.isEmpty());
	}
	public static void main(String[] args) {
		System.out.print("Enter brackets: ");
		String str =new Scanner(System.in).next();
	    if(areBalanced(str)) System.out.print(true);
	    else                 System.out.print(false);
	   	}
}
