class  A01{
	static int a=10;
	static{
    System.out.println("A01 SB1 Start");
    System.out.println("a:-"+a);
	System.out.println("A01 SB1 end");
	}
	static int b=20;
	static{
    System.out.println("A01 SB2");
	}
	public static void main(String[] args) 
	{
		System.out.println("MAIN METHOD");
	}
	static{
    System.out.println("A01 SB3");
	}
	static int c=30;
	static{
    System.out.println("A01 SB4");
	}
}
