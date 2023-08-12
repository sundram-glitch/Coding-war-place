class A04 {

/*private*/static void m1(){//first m1() call in m2() cursor first move in m1() then only decide from where it has to exe based on implicit obj
System.out.println("m1 of A04");
	}
    void m2(){
System.out.println("m2 of A04");
	m1();
	}
	public static void main(String[] args){
		System.out.println("main of A04!");
	}
}

class B04 extends A04{
 void m1(){
System.out.println("m1 of B04");
	}
}
public class Test04{

public static void main(String[] args){
		System.out.println("main tst!");
		A04 a1=new B04();
		//a1.m1();
		//a1.m2();
		A04 a2=new A04();
		//a2.m1();
		//a2.m2();
	    B04 b1=new B04();
	    b1.m1();
		b1.m2();
	}
}