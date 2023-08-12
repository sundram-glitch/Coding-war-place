class A{
	
	int x=10;
	int y=20;

	A(){
		System.out.println("IN A CLS CONS");    
	}

	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}

class B extends A{

	int p=30;
	int q=40;
	B(){

	}
}

public class Test{
	
	public static void main(String... args){
    B b1=new B();
    System.out.println("b1.x:"+b1.x);
	System.out.println("b1.y:"+b1.y);
	System.out.println("b1.p:"+b1.p);
	System.out.println("b1.q:"+b1.q);
	A a1=b1;
	System.out.println("a1.x:"+a1.x);
	System.out.println("a1.y:"+a1.y);
	/*System.out.println("b1.p:"+a1.p);
	System.out.println("b1.q:"+a1.q);
	Test.java:31: error: cannot find symbol
        System.out.println("b1.p:"+a1.p);
                                     ^
  symbol:   variable p
  location: variable a1 of type A
Test.java:32: error: cannot find symbol
        System.out.println("b1.q:"+a1.q);
                                     ^
  symbol:   variable q
  location: variab*/
	}
}