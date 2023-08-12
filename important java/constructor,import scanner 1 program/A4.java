class A4 {
	static int a=10;
	int x=20;
	static{
		System.out.println("A is Loaded");
	}
    void m1(){
    System.out.println("m1() of A4 super");
	}
	void m2(){
    System.out.println("m2() of A4 super");
	}
}
class B1 extends A4{
  static int b=30;
  void m1(){
  super.a=1;
    super.x=2;
  System.out.println("value of a"+a);
  System.out.println("value of x"+x);
  }
  int y=40;
  static{
	
	  System.out.println("B is Loaded");
  }
}
class C1 extends A4{
  static int c=50;
  int z=60;
  void m2(){
	      super.x=2;
  }
  static{
	  System.out.println("C is Loaded");
   }
}

class Call{
	public static void main(String[] args){
    System.out.println("in call mm start");
    A4 a1=new B1();
	a1.m1();
	A4 a2=new C1();
    a2.m2();
    System.out.println("in call mm END");
	}
}