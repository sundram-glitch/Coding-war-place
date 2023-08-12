class  Example14
{
	 static class S{
		 private int y=20;
		/* static void m1(){
			 System.out.println("Inner class SM m1");
		 }
		 void m2(){
			 System.out.println("Inner class NSM m2");
		 }*/
	 }
	public static void main(String[] args) 
	{
		 //S.m1();
		 S a=new S();
		 System.out.println("a.y"+a.y);
		// a.m2();

		System.out.println("Hello World!");
	  }
    
}
