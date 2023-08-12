class Example12
{
	 static int a;

	 int x;
	 int y;

	 static{
		 a=10;
		 System.out.println("SIB is executed");
		 System.out.println("a="+a);
	 }

	Example12(){
		x=20;
      
		System.out.println("\nIIB is executed");
		System.out.println("x="+x);

	}
	Example12(int y){
		this.y=y;
		System.out.println("ip constructor is executed");
	}
	public static void main(String[] args) 
	{
		System.out.println("MAIN is executed start");
		Example12 t1=new Example12();
		Example12 t2=new Example12(30);
	    System.out.println("\nt1 object values");
		System.out.println("t1.a:"+t1.a);
		System.out.println("t1.x:"+t1.x);
		System.out.println("t1.y:"+t1.y);

 System.out.println("\nt2 object values");
		System.out.println("t2.a:"+t2.a);
		System.out.println("t2.x:"+t2.x);
		System.out.println("t2.y:"+t2.y);
System.out.println("main is executed end");

	}
}
