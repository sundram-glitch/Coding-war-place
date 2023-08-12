class Example2 
{
	 static int a=10;
	 int x=20;
	 private int y=30;
       class A//Here in this inner class main method will not declare inner here inner class is non static 
	 {
		   //static int a=100;
		   int x=200;
		   private int y=300;
		 void m1(){

			/* Example2 e1=new Example2();*/
			 System.out.println("a"+a);
			 System.out.println("x"+/*e1.*/x);
			 System.out.println("y"+/*e1.*/y);
		 }
			 void m2(){
          A a=new A();
		  System.out.println("A.a"+a);
		  System.out.println("A.x"+a.x);
		  System.out.println("A.y"+a.y);

	 }
	 }
	public static void main(String[] args) 
	{
        Example2.A t=new Example2().new A();
		 t.m2();
		 Example2.A w=new Example2().new A();
         w.m1();
		System.out.println("Hello World!");
	}
	 
}