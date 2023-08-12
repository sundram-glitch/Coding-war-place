class Call_B{
	static{
    System.out.println("Call_B SB");
	}
	public static void main(String[] args){
	System.out.println("Start of main method!");
	B b=new B();
	b.m2();
	System.out.println("End of main");
	}
}
