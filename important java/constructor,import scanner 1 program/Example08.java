class Example08{
static int a=10;
static{
System.out.println("a:"+a);
System.out.println("b:"+this.getB());
}
	public static void main(String[] args) 
	{
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("main method end");
	}
	static int getB(){
		return b;
}
static int b=20;
}
