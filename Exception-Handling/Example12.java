class Example12{
	public static void main(String[] args){
	try{
		System.out.println("m!()"+m1());
	}
	catch(ArithmeticException e){
		System.out.println("Wrong value:");
	}
}
	static int m1(){
		try{
			System.out.println("In try");
			System.out.println(10/0);
		    return 10;
		}
		catch(ArithmeticException e){
            System.out.println("In catch");
			return 20;
        }
		finally{
           System.out.println("In finally");
		    return 30/0;
		}
	}
}
