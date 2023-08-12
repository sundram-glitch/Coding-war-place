interface Example {
	public /*abstract */void m1();

	public default void m2(){ 
		System.out.println("dm m2() is exe from interface Example");
	}

}

interface TestAmbi{
 void m1();
} 
//class Sample1 implements Example{ }

abstract class Sample2 implements Example, TestAmbi{ 
static public void m3(){
  System.out.println("am m3() is exe from class Sample2 ");
}
}

class Sample implements Example{
	@Override
    public void m1(){
		System.out.println("am m1() is exe from class Sample ");
	}
}
class Xyz implements Example{
	@Override
	public void m1(){
		System.out.println("am m1() is exe from class Xyz");
	}

	/*@Override
	public void m2(){
		System.out.println("dm m2() is exe from class Xyz");
	}*/

};
class Example00{
	public static void main(String[] args){
		Example e ;
		
		Example e1= new Sample();
		e1.m1();
		e1.m2();
        
		//Example e2= new Sample2();
		Sample2.m3();
		//Sample2.m2();//Example00.java:45: error: non-static method m2() cannot be referenced from a static context
		
		System.out.println();

	Example	e3=new Xyz();
		e3.m1();
		e3.m2();
  }
}