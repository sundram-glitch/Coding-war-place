class A{
	int x=m1();
	int m1(){
    System.out.println("A m");
	x=50;
	return 60;
	}
}
class B extends A{
 int x;
 int m1(){
 System.out.println("B m1()");
 x=70;
 return 80;
 }
}
public class TestAB{
	public static void main(String[] args){
		System.out.println("Inside main method!");
		B b1=new B();
		A a1=b1;//use already initialize values mean while...
        B b2=new B();
		A a2=b2;
		A a3=new A();
		A a4=new B();
		System.out.println("b.x:"+b1.x);
		System.out.println("a.x:"+a1.x);
	}
}
