class Test_Catch_With_Multiple_Exceptions{
	public static void main(String[] args){
		System.out.println("start!");
		try{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		System.out.println("Result: "+c);
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
	    System.out.println("Please Enter Only Integer,Two Integers");
	    }
		catch(ArithmeticException e){
		System.out.println("Please Do'nt Pass Zero as second valUe");
	    }
	}
}
