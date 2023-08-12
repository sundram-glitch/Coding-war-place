class Example25{
	public static void main(String[] args){
		System.out.println(m1());
	}
	static int m1(){
		for (int i=1;i<=5 ;i++ ){
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
				//return 10;
				//break;
				continue;
			}
			//System.out.println("After Inner try/catch/finally");
		}
		catch(NullPointerException e){
            System.out.println("In OUTER catch");
		}
		finally{
			System.out.println("In Outer Finally");
		}
		System.out.println("After  try/catch/finally");
		}
		return 100;
     }
}
