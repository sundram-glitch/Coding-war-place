class Example13 
{
		 static class A{

	static int a=10;
	       int x=20;
	private int y=30;
     
	 static void m1(){
		 System.out.println("Inner class SM m1");
	 }
	 void m2(){
		 System.out.println("inner class nsm m2");
	 }//inner class is closed
	/* static {
		 System.out.println("Outer class is loaded");
	 }
	 Example13(){
		 System.out.println("Outer class constructor");
	 }*/
	/* static class A{*/
		

	public static void main(String[] args) 
	{
		System.out.println("OUTER CLASS MAIN METHOD");
		System.out.println("OUTER CLASS MAIN METHOD"+a);

		 /*Example13();
		 Example13 e=new Example13();
		 e.m4();*/
		/*Example13.*/A.m1();
		Example13.A a=new Example13.A();
		a.m2();
		System.out.println("A.a"+a.x);
	   }
	}
}
