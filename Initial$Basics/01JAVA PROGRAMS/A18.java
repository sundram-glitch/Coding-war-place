class A18 {
	static int a=10;
	int x=20;
	static void m1(){
		System.out.println("A m1");
	}
	void m2(){
		System.out.println("A m2");
	}
	void m3(){
				System.out.println("A m3");
				System.out.println("A a:"+a);
				System.out.println("A x:"+x);
				m1();
				m2();

	}
}
class B18 extends A18{
	static int a=50;
	int x=60;
	static void m1(){
		System.out.println("B m1");
	}
	void m2(){
		System.out.println("B m2");
		System.out.println("B a:"+a);
				System.out.println("B x:"+x);
	}
	void m4(){
		super.a=a-10;
		super.x=x-10;

	}
}