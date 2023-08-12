class A5{
	static int a=10;
	int x=20;
}

class  B5 extends A5{

	static int a=30;
	int x=40;
	B5(int a){
    this.a=a;
	}
}

public  class Test5A5B5{
    public static void main(String... args){
    B5 b=new B5(23);
    A5 a=new A5();
	System.out.println("B5 a:"+B5.a+" b.x:"+b.x);
	System.out.println("A5.a:"+A5.a+" a.x:"+a.x);
	System.out.println("b.a:"+b.a+" b.x:"+b.x);
	System.out.println("a.a:"+a.a+" a.x:"+a.x);
	System.out.println("B5.a:"+B5.a+" A5.a:"+A5.a);
	B5.a=5;
	A5.a=6;
	b.x=7;
	a.x=8;
	System.out.println("b.a:"+b.a+" b.x:"+b.x);
	System.out.println("a.a:"+a.a+" a.x:"+a.x);
	System.out.println("B5.a:"+B5.a+" A5.a:"+A5.a);
	A5 a1=b;
	System.out.println("a1.a:"+a1.a+" a1.a:"+a1.a);
	System.out.println("B5 a:"+B5.a+" b.x:"+b.x);
	System.out.println("A5.a:"+A5.a+" a.x:"+a.x);
	}
}
