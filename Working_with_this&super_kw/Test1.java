class A1{
  A1(){
	  System.out.println("In class A constructor this:"+this);
   }
}
class B1 extends A1{

	B1(){
		System.out.println("In Class B constructor this:"+this);
	}
}

public class Test1{

public static void main(String[] args){
	 //B b=new B();
	 B1 b1=new B1();
	System.out.println("In class Test main b1:"+b1);
		System.out.println("Hello World!");
	}
}