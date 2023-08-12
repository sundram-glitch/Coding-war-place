//for static var if modified var values for one instance it will refelect to all instance ob obj
//but in nsm its vice-versa means one-to-one!!!
class A6 {

	int x=10;
	int y=20;
	void m1(){
    System.out.println(x);
	System.out.println(y);
	}
}
class B6 extends A6{

	static int x=30;
	static int y=40;

	void m2(){
		System.out.println(x);
		System.out.println(y);
    }
	static void m3(){
		System.out.println(x);
		System.out.println(y);
    }
	public static void main(String...args){
	B6 b1=new B6();
	B6 b2=new B6();
	b2.x=50; b2.y=60;
	b1.m1();
	b1.m2();
	System.out.println();
	b2.m1();
    b2.m2();
	m3();
	}
}
