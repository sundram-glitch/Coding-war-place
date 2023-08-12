class  SM_CF_TEST{
	
	static int a = m1();

	static{
    System.out.println("a from SB "+ a);
	}
	public static void main(String[] args){
		System.out.println("a from main !"+a);
	}
	static int m1(){
	a = 90;
	System.out.println("a from SM "+a);
	return 8;
	}
}
