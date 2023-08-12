class TestABC{ 
static{
	System.out.print("test ABC is loaded");
}
	public static void main(String[] args) {
		B1 b1=new B1();
		C1 c1=new C1();
		b1.a=15;
		b1.x=16;
		System.out.println("b1.a"+b1.a);
		System.out.println("c1.a"+c1.a);
		System.out.println("b1.x"+b1.x);
		System.out.println("c1.a"+c1.x);
		b1.m1();
		System.out.println("b1.a"+b1.a);
		System.out.println("c1.a"+c1.a);
		System.out.println("b1.x"+b1.x);
		c1.m2();
		System.out.println("c1.a"+c1.x);
		 

		System.out.println("--------------------------------------------------!");
	}
}
