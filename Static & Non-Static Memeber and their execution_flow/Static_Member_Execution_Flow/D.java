class D{
    static int a=10;
	static{
    System.out.println("From SB");
	m1();
	System.out.println("a:-"+a);
	//System.out.println("b:-"+b);//illegal_forward_reference
    System.out.println("D.b:-"+D.b);
	b=50;
	m1();
    //System.out.println("b:-"+b);//illegal_forward_reference
	System.out.println("D.b:-"+D.b);
	}
	static void m1(){
    System.out.println("values b "+b);
	}
	public static void main(String[] args) 
	{
	System.out.println("from main method!");
    System.out.println("a:-"+a);
	System.out.println("b:-"+b);
	}
	static int b=20;
}
