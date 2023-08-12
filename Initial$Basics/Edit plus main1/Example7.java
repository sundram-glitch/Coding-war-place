class Example7 
{
	 int x=10;
	 int y=20;


	 void m1(int a,int b){
		 x=a;
		 y=b;
	 }
      
	  void m2(int x,int y){
		  x=x;
		  y=y;
	  }
	  void m3(int x,int y){
		  Example7 e1=new Example7();

		  e1.x=x;
		  e1.y=y;
	  }
	public static void main(String[] args) 
	{
		  Example7 e1=new Example7();

		  System.out.println(e1.x+".........."+e1.y);

		  e1.m1(30,40);
		  System.out.println(e1.x+".........."+e1.y);

		  e1.m2(50,60);
          System.out.println(e1.x+".........."+e1.y);

		  e1.m3(70,80);
		    System.out.println(e1.x+".........."+e1.y);
		System.out.println("Hello World!");
	}
}
