class Example24{
	public static void main(String[] args){
		m1();
	}
	static void m1(){
		try{
			System.out.println("In outer try");
			try{
            System.out.println("In Inner try");
			}
			catch(NullPointerException e){
				System.out.println("In Inner catch");
			}
			finally{
				System.out.println("In Inner Finally");
			}
			System.out.println("After Inner try/catch/finally");
		}
		catch(NullPointerException e){
            System.out.println("In OUTER catch");
		}
		finally{
			System.out.println("In Outer Finally");
		}
		System.out.println("After  try/catch/finally");
     }
}
