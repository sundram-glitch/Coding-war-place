class Example15 
{
	 
		 static int q=99;
                int x=30;
		 private int y=323;
		  static class C {
			   void m1(){
				  Example15 a=new Example15();

				   System.out.println("a"+q);
				   System.out.println("X"+a.x);
				   System.out.println("Y"+a.y);
			   }
	 
		   }
	public static void main(String[] args) {
		/*Example15.C.m1();*/
		Example15.C c=new Example15.C();

		   c.m1();
		System.out.println("Hello World!");
	}


}