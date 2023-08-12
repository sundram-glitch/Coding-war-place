class Example02{
	 void m1(){
		System.out.println("Example m1");
	}
	 int m2(){
		System.out.println("Example m2");
		return 10;
	}
	void m3(){
	System.out.println("Example m3");
	}
}
class Sample02 extends Example02{
protected void m1(){
	System.out.println("Protecte m1()");
}
 int m2(){
	 return 8;
 }
  void m3(){
	  System.out.println("M3 method");
 }
	public static void main(String[] args) {
		Example02 e1=new Sample02();
		e1.m1();
		e1.m2();
		e1.m3();
		System.out.println("Hello World!");
	}
}