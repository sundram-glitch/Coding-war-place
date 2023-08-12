class Example11 {
       	Example11 e=new Example11();
	static{
		System.out.println("sb start");
		//Example11 e=new Example11();
		System.out.println("sb end");
	}
	
	int x=m2();
	int m2(){
		System.out.println("NSV x");
		System.out.println("end of m2");
		return 10;
}
	{
		System.out.println("NSB start");
		//Example11 e=new Example11();
		System.out.println("NSB end");
	}
	Example11(){
		System.out.println("Constructor");
		//Example11 e=new Example11();
		System.out.println("end of constructor");

	}
	public static void main(String[] args){
		System.out.println("Main start");
		//Example11 e=new Example11();
		/*1System.out.println("Object created");*/
		System.out.println("End main");
	}
}

