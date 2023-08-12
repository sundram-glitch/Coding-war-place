class A1{
	int x=10;
	int y=20;
}
class B2 extends A1{
   int x=30;
   int y=40;
}
class Testing{
	public static void main(String[] args) 
	{
        B2 b=new B2();
		A1 a=new B2();

		System.out.println(b.x+"--------"+b.y);
		System.out.println(a.x+"========"+a.y);

		b.x=5;
		a.x=6;

		System.out.println(b.x+"-------------"+b.y);
		System.out.println(a.x+"============="+a.y);

		System.out.println("-----------------");
	}
}
