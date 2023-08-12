class Sample04{
	void m1(int a){
		System.out.println("int-arg");
	}
	void m1(Integer a){
    System.out.println("Integer-arg's Smaple");
	}
}
class Example04 extends Sample04{
    @Override
    void m1(Integer a){
		 System.out.println("Integer-arg's Example");
	}
 	public static void main(String[] args){
		Sample04 s=new Sample04();
		s.m1(10);
		s.m1(new Integer(10));
		Sample04 e=new Example04();
		e.m1(10);
		e.m1(new Integer(10));
		e.m1(new Integer(10).intValue());
		System.out.println("Hello World!");
	}
}
