class A3{

	static int a=10;
	int x=20;

	static void m1(){
    System.out.println("A Cls m1()");
	}

	void m2(){
    System.out.println("A cls m2()");
	}

	void m3(){
    System.out.println("A class m3()");
	}
}

public class B3 extends A3{
 
 static int a=50;
 int x=60;

 static void m1(){
 A3.m1();
 System.out.println("B class m1()");
 }

 void m2(){
 System.out.println("B class m2()");
 super.m2();
 }

 void m4(){
 System.out.println("super.a "+super.a+" a:"+a);
 System.out.println("super.x "+super.x+" x:"+x);
 super.m1();
 m1();
 super.m2();
 m2();
 }

 public static void main(String[] args){
 B3 b=new B3();
 b.m4();
	System.out.println("Hello World!");
	}
} 
