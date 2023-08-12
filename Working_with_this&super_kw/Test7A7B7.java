class A7{
	int x=10;
	int y=20;

	void m1(){
    System.out.println("x:"+x+this);
    System.out.println("y:"+y+this);
	}
	void m2(){
	}
}

class B7 extends A7{
     int x=30;
	 int y=40;

    void m2(){
	System.out.println("x:"+x+this);
	System.out.println("y:"+y+this);
	System.out.println("super'sx:"+super.x+this);
	System.out.println("super'sy:"+super.y+this);
    }
  
    void m3(){
		x=50;
		y=60;

		super.x=70;
		super.y=80;
	}
}

public class Test7A7B7{
      public static void main(String... args){
      B7 b1=new B7();
	  A7 a1=b1;
	  B7 b2=new B7();
	  A7 a2=b2;

	  b1.m3();
	  System.out.println("b1.x:"+b1.x+" b1.y"+b1.y);
	  System.out.println("a1.x:"+a1.x+" a1.y"+a1.y);
	  System.out.println("b2.x:"+b2.x+" b2.y"+b2.y);
	  System.out.println("a2.x:"+a2.x+" a2.y"+a2.y);
	  
      b1.m1(); b1.m2();
	  System.out.println();
	  b2.m1(); b2.m2();
      System.out.println();
	  a1.m1(); a1.m2();
	  System.out.println();
	  a2.m1(); a2.m2();
	  }
}
