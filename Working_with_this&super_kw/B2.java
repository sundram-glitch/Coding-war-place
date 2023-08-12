class A2{
    static int a=10;
	int x=20;

	static void m1(){
    System.out.println("A2 cls m1()");
	}
	
	void m2(){
    System.out.println("A2 cls m2()");
	}

	void m3(){ 
    System.out.println("A2 CLS M3()");
	}
}

public class B2 extends A2{

	static int a=50;
	int x=60;
    int c=23;
	static void m1(){
	System.out.println("B2 CLS m1()");
    }

	void m2(){
    System.out.println("B2 CLS M2()");
    }
	public static void main(String[] args){
	System.out.println("in main method");
    B2 b=new B2();
	System.out.println("b.a: "+b.a);
	System.out.println("x: "+b.x);
    b.m2();
	b.m3();
    A2 a=b;
	System.out.println("a.x: "+a.x);
    System.out.println("a.a: "+a.a);
    a.m2();
	a.m3();
    //System.out.println("a.c: "+a.c);
   }
}