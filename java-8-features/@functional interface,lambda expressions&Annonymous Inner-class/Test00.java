class A{
    A(){
    System.out.println("Nenu Cheppanu Brother");
	}

static void m1(){
    System.out.println("hi");
}
void m2(){
	System.out.println("Hello");
    }
}

@FunctionalInterface
interface I1{
	void abc();
}
 
 class Test00{
 
public static void main(String[] args){
    I1 i1=()->{System.out.println("\nHi");};
	I1 i2=()->A.m1();
	/*new Test00(new I1(){
	public void abc(){
    System.out.println("hellll");
	}
}).abc();*/
	I1 i3=()->{System.out.println("\nHelle");};
	I1 i4=()->{A a=new A();      a.m1();   };
	I1 i41=()->{ new A().m1(); };
	I1 i5=()->{System.out.println("Nenu Cheppu Brother"); };
	I1 i6=()->{new A();};
    i1.abc();
	i2.abc();
	i3.abc();
	i4.abc();
	i41.abc();
	i5.abc();
	i6.abc();
	System.out.println("Hello World!");
	}
}
