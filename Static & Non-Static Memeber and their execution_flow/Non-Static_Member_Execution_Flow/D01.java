class  A01{
    void m1(){
    System.out.println("A m1");
	}
	void m2(){
    System.out.println("A m2");
	m1();
	}
}
class B01 extends A01{
	void m1(){
    System.out.println("B m1");
	}
	void m3(){
    System.out.println("B m3");
	m1();
	//m2();
	super.m2();
	}
}
class C01 extends B01{
	void m2(){
    System.out.println("C m2");
	}
}
class D01 extends C01 {
	void m1(){
    System.out.println("D m1");
	}
	void m2(){
    System.out.println("D m2");
	}
	void m4(){
    System.out.println("D m4");
	}
	public static void main(String...args){
    D01 d1=new D01();
	d1.m1();
	d1.m2();
	d1.m3();
	d1.m4();
	}
}
