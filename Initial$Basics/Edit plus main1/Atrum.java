class Atrum 
{
	static void m1(){
         System.out.println("in m1");
	}
	static void m2(){
	System.out.println("in m2,start");
	int m=10;
	int n=20;
	System.out.println("m2end");
}
   static void m3(){
	   System.out.println("in m3,start");
	   int m=30;
	   int n=40;
	   System.out.println("m2 end");
   }

	public static void main(String[] args) 
	{
		System.out.println("main start");
		m1(); m2(); m3();

		int m=50; int n=60;
		System.out.println("main end");
	}
}
