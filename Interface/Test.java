interface Example01 {
	/*abstract*/ void m1();
	//abstract static void m12();
	static int a=10;
	int x=20;
	/*static{
		System.out.println("Example SB");
	}
	{
		System.out.println("Example NSB");
	}
	Example01(){
		System.out.println("Example COnstructor");
	}
	
	void m3(){
		System.out.println("Example NSM m3");
	}*/
	static void m2(){
		  System.out.println("Example static m2");
	}

	default void m5(){
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

class Sample01 implements Example01 {
	 {
		System.out.println("Sample NSB");
	}
	static{
		System.out.println("Sample SB");
	}
	 public int m3(){
		 System.out.println("Sample m3");
	  return 9;
	 }
	 public void m1(){
		 System.out.println("Sample m1");
	 	 }
		 public static void m12(){
		 System.out.println("Sample m1");
	 	 }
	static int b=m4();
	int y=m3();
	
	
	Sample01(){
		System.out.println("Sample COnstructor");
	System.out.println("x"+x);
	}
	static int m4(){
		  System.out.println("Sample static m4");
	   return 3;
 	}
  public	void m5(){
		System.out.println("Sample NSM m5");
	}
    static{
		System.out.println("Sample SB");
	}
	{
		System.out.println("Sample NSB");
	}

}
public class Test{

	public static void main(String[] args){
      System.out.println("Sample main!");
	  System.out.println("B:"+Sample01.b);
	  System.out.println("b printed:");
	  Example01.m2();
	  Sample01.m4();
	  System.out.println();
	  Example01 e1=new Sample01();
	  e1.m1();
	  //e1.m3();
	  e1.m5();
	}
}
