class Eexample 
{
	int x=10;
	int y=20;

	void m1(Eexample e)
	{
     System.out.println("passed original value before modification");
	 System.out.println(x+"...."+y);//10...20

	 x=5;    y=6;

     System.out.println("passed value after modification");
	 System.out.println(x+"...."+y);//5...6
	}
	public static void main(String[] args) 
	{
		Eexample e1=new Eexample();

        Eexample e2=new Eexample();
		 System.out.println("e1 object value before calling m2() method");
         System.out.println(e2.x+"...."+e2.y);//10...20

		 e1.m1(e2);

		 System.out.println("e1 object value before calling m2() method");
         System.out.println(e1.x+"...."+e1.y);//5...6                                                                      gt 
	}
}
