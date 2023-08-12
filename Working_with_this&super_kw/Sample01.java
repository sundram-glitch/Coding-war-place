class Example01{
	int x=10;
	int y=20;

	void m1(){
	
	//System.out.println(super.x); c f s
	System.out.println(this.x);
    System.out.println("m1()");
	}
}

public class Sample01 extends Example01{

    int x=30;
	int y=40;

	void m2(){
    System.out.println("x:"+x);
    System.out.println("y:"+y);
	System.out.println("super.x:"+super.x);
	System.out.println("super.y:"+super.y);
	}

	void m3(){
    x=50;
	int y=60;
//values of x,y is modified so after m3 method from blocks if access vlaues we will get modified values...
	System.out.println("local x:"+x);
	System.out.println("local y:"+y);
	System.out.println("subcls x:"+x);//modified values will come means var shadow value will come
	System.out.println("subcls y:"+y);//modified values will come means var shadow value will come
	System.out.println("supercls x:"+super.x);
	System.out.println("supercls y:"+super.y);
	}

    void m1(){
	System.out.println(super.x);
	System.out.println(this.x);
    System.out.println("m1()'s Sample");
	}
	public static void main(String...args){
    Sample01 s=new Sample01();
	s.m2();
	s.m3();
    Example01 e=s;
	e.m1();
	
	}
}