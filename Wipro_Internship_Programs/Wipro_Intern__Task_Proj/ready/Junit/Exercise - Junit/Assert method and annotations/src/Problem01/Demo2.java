package practice;
public class Demo2 {
	static boolean palindromeCheck(String s){
		boolean b = true;
		int n = s.length();
		if(n == 0) 
			return false;
		else {
			int i=0;
			while(n>0) {
				if(n == 1) return true;
				else if(s.charAt(i) == s.charAt(n - 1)) b = true;
				else return false;
				i++;n--;
			}
			return b;
		}	
	}
}
