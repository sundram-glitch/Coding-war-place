class Example16 
{
	static int a=10;
	int x=20;
	private int y=30;
	class A{
        void m1(){
			A a=new A();
			Example16 e1=new Example16();



			System.out.println(a);
			System.out.println(e1.x);
			System.out.println(e1.y);
		}//non static method closed
	}
	public static void main(String[] args) 
	{
		/*Example16.A a=new Example16.A();*/
		Example16 e1=new Example16();
		e1.m1();

		System.out.println("main method closed");
	}
}
