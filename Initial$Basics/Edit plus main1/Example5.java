class Example5 
{
    int x=10;
	int y=20;

	void m1(Example5 e){
		System.out.println("\te:"+e);
		 e=new Example5();
		System.out.println("\te:"+e);
	}

	public static void main(String[] args) 
	{
		 Example5 e1=new Example5();
		 Example5 e2=new Example5();
		System.out.println("e2:"+e2);
		e1.m1(e2);
		System.out.println("e2:"+e2);
	}
}
