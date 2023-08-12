class Example07{
	int x=m1();
	int m1(){
		System.out.println("NSV x");
		return 50;
}
	{
		System.out.println("NSB1");
	}
	Example07(){
		System.out.println("No-argument constructor");
		x=80;
        y=90;
	}
	public static void main(String[]args){
		System.out.println("Main");
				Example07 e=new Example07();
	System.out.println("After Initializing object e.x and e.y values"+e.x+"          "+e.y);
	}
	{
		System.out.println("NSB2");
	}
	int y=m2();
	int m2(){
System.out.println("NSV y");
	return 60;
	}
}
