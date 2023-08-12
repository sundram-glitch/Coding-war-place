class  B{
	static long a=m1();
	static{
	System.out.println("B SB");
	}
	static long m1(){
    System.out.println("B SM m1");
	return B.a;
	}
	static{
    a =10;
	System.out.println("B SB");
	}
	B(){
   System.out.println("B cons");
	}
	public static void  m2(){
    System.out.println("B SM m2");
	System.out.println("B SM m2"+a);
	}
	public static void main(String[] args) 
	{
		System.out.println("main method!");
		B b=new B();
	    b.m2();m2();

		System.out.println("end of main");
	}
	{
    System.out.println("HI in nsb");
	}
}
//first all static members exe will complete then only it going to 
//constructor call as default cons(no explicit cons) and first ini
//NSB then itself and then work on further calling stmt...