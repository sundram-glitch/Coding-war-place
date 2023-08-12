class A{
	 static{
		 System.out.println("SB start");
	 }
	public static void main(String[] args) 
	{
		System.out.println("main start");
		A a=new A();
		System.out.println("Main end");
		}
		A(){
			System.out.println("Contructor start");
			//A a=new A();
		}
}
//StakoverflowError