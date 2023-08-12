class Variable_Initialization_Example04{
	public static void main(String[] args){
		System.out.println("main start ");
		m1();
	}
	static void m1(){
		int a;
		try{
			//a = 10;
		}
		catch(ArithmeticException e){
			a = 20;
		}
		finally{
		a = 8;
		System.out.println("a:"+a);
		}
		System.out.println("a:"+a); 
    }// try/catch/finally should keep its own values so that current method(m1) can use any of these values 
	//based on the block execution
}
