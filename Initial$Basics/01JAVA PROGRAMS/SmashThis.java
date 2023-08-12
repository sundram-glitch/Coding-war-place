class SmashThis
{
	static int i=10;
	static double d=50.0;
	      String st="sundram";
		  char ch='a';
		  boolean b=true;
		  void m1(){
	System.out.println(i);
	System.out.println(d);
	System.out.println(st);
	System.out.println(ch);
	System.out.println(b);
    }
	void m2(){
    System.out.println(i);
	System.out.println(d);
	System.out.println(st);
	System.out.println(ch);
	System.out.println(b);
	}
	public static void main(String[] args) 
	{
		SmashThis s1=new SmashThis();
        SmashThis s2=new SmashThis();
		s1.m1();
		s2.m2();
		System.out.println("Hello World!");
	}
}
