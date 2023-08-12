class Example13 
{
	 static {
		 System.out.println("Outer class is loaded");
	 }
	 Example13(){
		 System.out.println("Outer class constructor");
	 }
	 static class A{
		 static {
		 System.out.println("Inner class is loaded");
	 }
	 A(){
		 System.out.println("inner class constructor");
	 }
	 static void m1(){
		 System.out.println("inner class SM");
	 }
	 void m2(){
		 System.out.println("inner class non-static method");
	 }
	 public static void main(String[]args){
		 System.out.println("inner class main");
		 /*Example13.m3();
		 Example13 e=new Example13();
		 e.m4();*/
		A.m1();
		Example13.A a=new Example13.A();
		a.m2();
	 }
}
  static void m3(){
	  System.out.println("Outer class SM");
  }
  void m4(){
	  System.out.println("Outer class NSM");
  }

	public static void main(String[] args) 
	{
		System.out.println("OUTER CLASS MAIN METHOD");
		 Example13.m3();
		 Example13 e=new Example13();
		 e.m4();
		 A.m1();
		Example13.A a=new Example13.A();//OPTIONAL
		a.m2();

	}
}
