abstract class Example{
  abstract void m1();
  abstract void m2();
	public static void main(String[] args){
		System.out.println("Hello World!");
	}
}
abstract class Sample extends Example{
	void m1(){
System.out.println("m1 from abs class Sample");
	}
}
class Prototype extends Sample{
void m2(){
System.out.println("m2 from prototype");
};
};
abstract class Standalone extends Sample{
	abstract void m1();
    abstract void m3();
};
class Singletone extends Standalone{
    void m1(){
System.out.println("m1 from SingleTome");
	}
    void m2(){
System.out.println("m2 from SingleToNE");
    }
    void m3(){
 System.out.println("m3 from Singletone");
	}
}

public class Tester{

	public static void main(String... args){
    //Example e1=new Example();
   //e.m1();
   //Example e2=new Sample();
   Example e3=new Prototype();
   e3.m1();
   e3.m2();
   //Example e4=new Standalone();
    Prototype e5=new Singletone();
	e5.m1();
    e5.m2();
((Standalone)e5).m3();
//((Prototype)e5).m2();
	}
}