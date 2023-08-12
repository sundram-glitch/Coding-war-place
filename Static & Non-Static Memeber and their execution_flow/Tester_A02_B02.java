class A02{
	static int a=10;
	int x=20;
	static void m1(){
    System.out.println("A m1");
	}
	void m2(){
    System.out.println("A m2");
	System.out.println("A a:"+a);
	System.out.println("A a:"+x);
	}
	void m3(){
    System.out.println("A m1");
	m1();
	m2();
	}
}

class B02 extends A02{
	
	static int a=50;
	int x=60;
	static void m1(){
    System.out.println("B m1");
	}
	void m2(){
    System.out.println("B m2");
	System.out.println("B a:"+a);
	System.out.println("B a:"+x);
	}
	void m4(){
    System.out.println("B m1");
	super.a=a-10;
	super.x=x-10;
	}
}
public class Tester_A02_B02{

public static void main(String ... args){
B02 b1=new B02();
B02 b2=new B02();
A02 a1=new B02();
b1.a=15; b1.x=16;
b2.a=18;b2.x=19;
	b1.m4(); b2.m4();
	     b1.m3();
  System.out.println();
         b2.m3();
  System.out.println(b1.a);
  System.out.println(a1.a);
  System.out.println(b1.x);
  System.out.println(a1.x);
}
}