import java.io.*; 
class Replace { 
	public static void main(String[] args) 
	{ 
		StringBuffer s = new StringBuffer("GeeksforGeeks"); 
		s.replace(5, 14, "are"); 
		System.out.println(s); // returns GeeksareGeeks 
	} 
} 
