class A 
{
	 static int a=10;
     int x=20;
	/* static*/ class B
	 {
		/* static**/ int a=50;
		 int x=60;
		 void m1(){
			 System.out.println("A"+a);
			 System.out.println("x"+x);

			 /*A a=new A();*/
			 System.out.println("A.a"+A.a);
			 System.out.println("A.X"+x);
		 }
	 }
	 void m2(){
		 System.out.println("A.m2"+a);
		 System.out.println("X.m2"+x);

		/*B a=new B();
		A b=new A();*///optional to as mindset
		 System.out.println("B.a.m2"+B.a);
         System.out.println("B.a.m2"+x);
         System.out.println("A.a"+A.a);

         System.out.println("A.a"+x);

		 

	 }
	public static void main(String[] args) 
	{
		A a=new A();
		a.m2();

		/*A.B b=new A.B();
		b.m1();*/

		System.out.println("Hello World!");
	}
}
