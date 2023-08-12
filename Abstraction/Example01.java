
public abstract class Example01 {
	abstract void m1();
	static int a=10;
	int x=20;
	static{
		System.out.println("Example SB");
	}
	{
		System.out.println("Example NSB");
	}
	Example01(){
		System.out.println("Example COnstructor");
	}
	static void m2(){
		  System.out.println("Example static m2");
	}
	void m3(){
		System.out.println("Example NSM m3");
	}
	void m5(){
		System.out.println("Example  m5");
	}
	public static void main(String[] args){
      System.out.println("Example main!");
	  System.out.println("a:"+a);
	  System.out.println("a printed:");
	  m2();
	  /*Example01 e=new Example01();
	  e.m3();*/
	}
}

class Sample01 extends Example01 {
	 void m1(){
		 System.out.println("Sample m1");
	 }
	static int b=20;
	int y=40;
	static{
		System.out.println("Sample SB");
	}
	{
		System.out.println("Sample NSB");
	}
	Sample01(){
		System.out.println("Sample COnstructor");
	}
	static void m4(){
		  System.out.println("Sample static m4");
	}
	void m5(){
		System.out.println("Sample NSM m5");
	}
	public static void main(String[] args){
      System.out.println("Sample main!");
	  System.out.println("B:"+b);
	  System.out.println("b printed:");
	  m2();
	  m4();
	  System.out.println();
	  Example01 e1=new Sample01();
	  e1.m1();
	  e1.m3();
	  e1.m5();
	}


}
