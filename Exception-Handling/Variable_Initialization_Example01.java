class Variable_Initialization_Example01{
	public static void main(String[] args){
		System.out.println("main start");
Variable_Initialization_Example01 var = new Variable_Initialization_Example01();
                                  var.m1();
	}
	void m1(){
		int a;//variable might not have been initialized
		try{
			a = 10; 
	System.out.println("a:"+a);
		}
		catch(ArithmeticException e){
	System.out.println("a:"+a);
		}
		System.out.println("a:"+a);
  }
}