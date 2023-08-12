class Example27{
	public static void main(String[] args){
		m1();
		System.out.println(m1());
	}
	static int m1(){
	try{
		System.out.println("In outer try");
		try{
		System.out.println("In Inner try");
		}
		catch(NullPointerException e){
		System.out.println("In Inner catch");
		}
		finally{
		System.out.println("In Inner finally");
		return 10;
		}
		//System.out.println("After Inner  try/catch/finally");
		}
	catch(NullPointerException e){
		System.out.println("In Outer catch");
		}
		finally{
		System.out.println("In outer  finally");
		return 30;
		}
		//System.out.println("After  try/catch/finally");
	}
}
