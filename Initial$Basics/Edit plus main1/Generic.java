class  Generic
{
	     static int a=10;

		  void m1(){
			 int a=30;
			  
			  a=a;
		System.out.println("a:"+a);
		 }
	public static void main(String[] args) 
	{    
		Generic g1=new Generic();
		int a=20;

		a=a;
		g1
		.m1();


		//System.out.println("a:"+a);
		//System.out.println(Generic.a);
	}
}
