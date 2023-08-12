abstract class Sample{
	abstract void m1();
	abstract int m2();
	abstract void m3(String s);
	abstract void m4();
	public  void m5(){System.out.println("m5()");}
}
	class Example extends Sample{
	void m1(){
	System.out.println("Example m1");
	}
	int  m2(){
		System.out.println("Example m2");
		return 20;
	}
    void m3(String s){
    System.out.println("String:"+s);
	}
	void m4(){
	try
	{
	int a=10/0;
	System.out.println("a:"+a);
	}
	catch (ArithmeticException e){
		System.out.println("Airthmetic Exception");
	}
}

	public static void main(String[] args) {
		Sample e=new Example();
		e.m1();
		e.m2();
		e.m3("Sundram");
		e.m4();
		e.m5();
		System.out.println("Hello World!");
	}
}
	