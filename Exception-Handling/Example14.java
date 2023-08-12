class Example14{
	public static void main(String[] args){
		System.out.println("m!():"+m1());
	}
	static int m1(){
		try{
			System.out.println("In try");
		    return 10;
		}
		catch(ArithmeticException e){
            System.out.println("In finally");
		}
		finally{
			System.out.println("In finally");
			if(false)
				return 30;
		}
		System.out.println("after try/catch/finally");
		return 0;
	}
}
