class B1 extends A1{
	@Override
		void m1(){
		System.out.println("B M1");
	}
	@Override
	void m2(){
		System.out.println("B m2");
	}
   void m3(){
	   System.out.println("B m3");
   }
	public static void main(String[] args) 
	{
		A1 a=new B1();
		B1 b=new B1();
		A1 a1=new A1();
		a.m1(); a1.m2(); b.m3();
		System.out.println("---------------------------");
	}
}
