class Var01
{
	static int m1(){
		return 60;

		
	}
	 
	public static void main(String[] args) 
	{
		 //primative vars
		 int p=50;
		 int q=m1();
  //ReSferenced vars
    String s1="a";
    String s2=new String("a");
    System.out.println("Hello World!");
	System.out.println(p);
   	System.out.println(q);

	Example e=new Example();
	Var01 n=new Var01();
	m1();
	System.out.println(e.x);
	System.out.println(e.y);
	}
	
}
