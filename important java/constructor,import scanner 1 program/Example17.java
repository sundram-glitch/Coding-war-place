class  Example17{
	static int b=20;
	static{
		System.out.println("In B SB");
		System.out.println("a:"+a);
		System.out.println("b:"+getExample17());
	}
	static int getExample17(){
		return b;
	}
	public static void main(String[] args) 
	{
		System.out.println("In B main");
		System.out.println("a:"+a);
		System.out.println("b:"+b);

		System.out.println("----------------------------------------------------");
	}
}
