class Example13{
	public static void main(String[] args){
	try{
		System.out.println("m!()"+m1());
	}
	catch(ArithmeticException e){
		System.out.println("Wrong value:");
	}
}
	static int m1(){
		for(int i=1; i <=5;i++){
		try{
			System.out.println("In try");
			System.out.println(10/0);
		    return 10;
		}
		catch(ArrayIndexOutOfBoundsException e){
            System.out.println("In catch");
			return 20;
        }
		finally{
           System.out.println("In finally");
		   return 30/0;
		}
	}
	return 0;
	}
}
