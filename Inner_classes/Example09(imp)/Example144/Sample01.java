class Sample01 
{
	 static{
		 System.out.println("Outer class is loaded");
	 }
	 Sample01(){
          System.out.println("Outer class Constructor");
	 }
	 static class Example{
		 static{
			 System.out.println("inner class is loaded");
		 }
		 Example(){
			 System.out.println("Inner class constructor");
	 }
	 static void m1(){
		 System.out.println("INNER CLASS SM");
	 }
	 void m2(){
		 System.out.println("inner class nsm");
	 }

	public static void main(String[] args) 
	{
		System.out.println("INNER CLASS MAIN");
		Sample01.m3();
		Sample01 s=new Sample01();
		s.m4();
	}
}
  static void m3(){
	  System.out.println("Outer class SM");
	}
	void m4(){
		System.out.println("Outer class NSM");
}
  public static void main(String[]args){
	  System.out.println("Outer class main");
	  Example.m1();
	  Sample01.Example a=new Sample01.Example();
	  a.m2();
  }
}