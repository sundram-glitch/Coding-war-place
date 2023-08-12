class A1{ 
A1(){
	System.out.println("constructor");
	A1 a=new A1();
}
	public static void main(String[] args) 
	{
		System.out.println("main!");
		A1 a=new A1();
	}
}
