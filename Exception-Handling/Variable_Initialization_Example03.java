class Variable_Initialization_Example03{
	public static void main(String[] args){
		System.out.println("main start");
Variable_Initialization_Example01 var = new Variable_Initialization_Example01();
                                  var.m1();
	}
	void m1(){
		int a;
		try{
			a = 10; 
	System.out.println("a:"+a);
		}
		catch(ArithmeticException e){
			a = 20;
	System.out.println("a:"+a);
		}
		catch(NullPointerException e){
	System.out.println("a:"+a);
		}
		System.out.println("a:"+a);
  }
}