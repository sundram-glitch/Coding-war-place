class Example26{
	public static void main(String[] args){
		m1();
		System.out.println("Hello World!");
	}
	static void m1(){
		try{
		System.out.println("In outer try");
		try{
		System.out.println("In Inner try");
		System.out.println(10/0);
		}
		catch(NullPointerException e){
		System.out.println("In Inner finally");
		}
		finally{
		System.out.println("In Inner finally");
		}
		System.out.println("After Inner  try/catch/finally");
		}
		catch(NullPointerException e){
		System.out.println("In Outer catch");
		}
		finally{
		System.out.println("In outer  finally");
		}
		System.out.println("After  try/catch/finally");
	}
}
