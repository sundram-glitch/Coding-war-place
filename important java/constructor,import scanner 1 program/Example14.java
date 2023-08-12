class  Example14{
	static int a=m1();
	static int m1(){
		System.out.println("A sv");
		return 10;
	}
static{
	System.out.println("A SB");
	Example15 e=new Example15();
}

	public static void main(String[] args) {
		System.out.println("A main!");
	}
}
/*class  Example15 extends Example14{
	static int b=m2();
	static int m2(){
		System.out.println("B sv");
		return 20;
	}
static{
	System.out.println("B SB");
	        System.out.println("\nB main a:"+a);
					System.out.println("B main b:"+b);


}

		public static void main(String[] args) {
		System.out.println("B main!");
        System.out.println("\nB main a:"+a);
		System.out.println("B main b:"+b);
	}
  
}*/


