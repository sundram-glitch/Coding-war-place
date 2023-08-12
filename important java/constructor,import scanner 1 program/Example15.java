class  Example15 extends Example14{
	static int b=m2();
	static int m2(){
		System.out.println("B sv");
		return 10;
	}
static{
	System.out.println("B SB");
}

		public static void main(String[] args) 
	{
		System.out.println("B main!");
        System.out.println("\nB main a:"+a);
		System.out.println("B main b:"+b);
	}
}



