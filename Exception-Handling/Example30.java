class Example30{
	public static void main(String[] args){
		m1();//without return statement call
		//System.out.println(m1()); no return statement
	}
	static void m1(){
		for (int i=1;i<=2 ;i++ ){
	try{
		System.out.println("In outer try");
		try{
		System.out.println("In Inner try");
		System.out.println(10/0);
		}
		catch(NullPointerException e){
		System.out.println("In Inner catch");
		}
		finally{
		System.out.println("In Inner finally");
		break;
		//return 10;
		}
		//System.out.println("After Inner  try/catch/finally");
		}
	catch(NullPointerException e){
		System.out.println("In Outer catch");
		}
		finally{
		System.out.println("In outer  finally");
		//return 30;
		}
	}
	    System.out.println("After  try/catch/finally");
	}
}
