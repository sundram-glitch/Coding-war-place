interface Interface01 {
	public abstract void m1();

	public default void m2(){ 
		System.out.println("dm m2() is exe from interface Example");
	}
}

//class Sample1 implements Example{ }

abstract class Sample2 implements Interface01{ }

class Sample implements Interface01{
	@Override
	public void m1(){
		System.out.println("am m1() is exe from class Sample ");
	}
}
class Xyz implements Interface01{
	@Override
	public void m1(){
		System.out.println("am m1() is exe from class Xyz");
	}

	@Override
	public void m2(){
		System.out.println("dm m2() is exe from class Xyz");
	}

};
class Example01{
	public static void main(String[] args){
		Interface01 e=null;
		
		e = new Sample();
		e.m1();
		e.m2();

		System.out.println("--------------------------------");

		e = new Xyz();
		e.m1();
		e.m2();
	}
}