class A03{
static void m1(){
	System.out.println("A m1");
}
static void m2(){
	System.out.println("A m1");
   } 
}
class B01 extends A03{
/*static void m1(){
	System.out.println("B m1");
}*/
void m3(){
		System.out.println("B m3");
		m1();
		super.m2();
    }
   static	void m4(){
		System.out.println("B class m4");
	}
}
class C01 extends B01{
static void m2(){
		System.out.println("C m2");
		m4();
	}
}
class D01 extends C01{
   static void m1(){
		System.out.println("D m1");
}
static void m2(){
	System.out.println("D m2");
}
static void m4(){
	System.out.println("D m4");
}
	public static void main(String[] args) 
	{D01 d=new D01();
	d.m1();
	d.m2();
	d.m3();
	d.m4();
		System.out.println("---------------------------------------------------!");
	}
}
