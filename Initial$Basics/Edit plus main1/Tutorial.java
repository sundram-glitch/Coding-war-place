class Tutorial
{
	static int a=434;// int a=434; is not allow int- error: non-static variable a cannot be referenced from a static context
	 static void m1(){
		 a=434;
		 System.out.println(a);
	 }
	public static void main(String[] args) 
	{
           Tutorial t1=new Tutorial();

		   t1.m1();
		System.out.println("Hello World!");
	}
}
