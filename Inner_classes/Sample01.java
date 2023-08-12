class Example05 
{
	 static class A{
	 private int y=20;
     static void m1(){System.out.println("inner class SM m1");}
     void m2(){System.out.println("inner class NSM m2");}
	 }//inner closed
}
     class Sample01 {
	public static void main(String[] args) 
	{
		Example05.A.m1();
		Example05.A a=new Example05.A();//mandatory to notice for inner class
		//System.out.println("a:"+a.y); Private method can not access from another class
		a.m2();
		System.out.println("Main method end");
	}
}
