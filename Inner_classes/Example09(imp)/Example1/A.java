class A{
	  static int a=10;
	  int x=20;
static class B{
          static int a=50;
		  int x=60;

		
		 void m1(){
			 System.out.println("a"+a);
			 System.out.println("x"+x);

			 /*A a=new A();*/
			 System.out.println(/*A.*/a);
           	 System.out.println(/*a.*/x);
		 }//m1 method is closed
}//inner class close
    void m2(){
		System.out.println("A"+a);
		System.out.println("x"+x);
       B b=new B();
	   System.out.println("B.a"+B.a);
	   System.out.println("B.x"+b.x);
	}
	public static void main(String[] args) 
	{  A a=new A();
		a.m2();
		A.B b=new A.B();
		b.m1();
		
		System.out.println("Hello World!");
	}
}

