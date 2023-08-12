class Example6 
{
	 int x=10;
	 int y=20;

	 void m1(){
		 Example6 e=new Example6();
		 System.out.println(x);
		 System.out.println(y);
      
	          int x=50;
			  
		 System.out.println(x);
		 System.out.println(e.x);
         System.out.println(y);

	 }
		 
	public static void main(String[] args) 
	{

		 Example6 e1
			 =new Example6();
		 e1.m1();

		System.out.println("Hello World!");
	}
}
