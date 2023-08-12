// Java puzzle to illustrate use 
// of hashcode() and equals() method 
import java.util.*; 
public class Name{ 
	private final String first, last; 
	public Name(String first, String last) 
	{ 
		this.first = first; 
		this.last = last; 
	} 
	public boolean equals(Object o) 
	{ 
		if (!(o instanceof Name)) 
			return false; 
		Name n = (Name)o; 
		return n.first.equals(first) && n.last.equals(last); 
	} 
	public static void main(String[] args) {
		Name n1=new Name("shubham","Juneja");
		Set<Object> s = new HashSet<>();
		s.add(9);
		s.add(new Name("Shubham", "Juneja")); 
		s.add(n1);
		System.out.println( 
			s.contains(new Name("Shubham", "Juneja"))); 
        System.out.println(s.contains(n1));
		System.out.println(s);
		Set<Object> l=new LinkedHashSet();
        l.clear();
		l.add(s);
        System.out.println(l);
	} 
} 
