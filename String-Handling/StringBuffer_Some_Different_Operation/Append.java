import java.io.*; 
class Append { 
	public static void main(String[] args) 
	{ 
		StringBuffer s = new StringBuffer("Geeksfor"); 
		s.append("Geeks"); 
		System.out.println(s); // returns GeeksforGeeks 
		s.append(1); 
		System.out.println(s); // returns GeeksforGeeks1 
	} 
} 
