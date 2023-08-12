class Example01{
	static void add(){
    System.out.println("no-args");
	}
		static void add(int a){
    System.out.println("one-args");
	}
		static void add(int a,int b){
    System.out.println("Two-args");
	}
		static void add(int a,int b,int c){
    System.out.println("Three-args");
	}
		static void add(int a,int b,int c,int d){
    System.out.println("Four-args");
	}
}
public class Test01{
public static void main(String[] args){
		System.out.println("Hello World!");
		Example01.add();
		Example01.add(5);
		Example01.add(5,6);
		Example01.add(5,6,7);
		Example01.add(5,6,7,8);
	}
}
