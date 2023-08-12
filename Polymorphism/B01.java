class B01 extends A01 {
	static void m1(){
		System.out.println("B m1");
		A01 a=new A01();
	   m1();
	}
	 void m2(){
		System.out.println("B m2");
	  super.m1();
	 }
	public static void main(String[] args) 
	{
		B01 b=new B01();
		b.m1(); 
		b.m2();
       A01 a=new B01();
	   a.m1(); a.m2();
		System.out.println("------------------------------------------------------------qqq");
	}
}
