class Create
{
     static int a=393;
	 static int b=4949;
  private static void m1() //public/private
	{
		System.out.println("a"+a);
        System.out.println("b"+b);

	}
     public static void main(String[] args) 
	{    
		Create c1=new Create();
		c1.m1();
		System.out.println("a"+a);
        System.out.println("b"+b);
}
}
