class Example12 {
	int x=5,y=10; 
	//public static Example12 e=new Example12();
	{
	System.out.println("initialization Blocked is called");
	//Example12 e=new Example12();
	System.out.println("e.x"+x);
	System.out.println("e.x"+y);
	}
	public static void main(String[] args){
		Example12 e=new Example12();
		System.out.println("Hello World!");
	}
}
