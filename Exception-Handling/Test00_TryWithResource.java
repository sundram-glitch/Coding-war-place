import java.io.PrintStream;
class Test00_TryWithResource{
	public static void main(String[] args){
		System.out.println("start!");
		try(PrintStream ps = new PrintStream(System.out)){
		ps.println("Hi");
		}//stream autoclosable so here stream automatically closed
		System.out.println("after try-with-resource");
	}
}
