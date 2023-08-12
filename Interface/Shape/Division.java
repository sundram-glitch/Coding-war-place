class  Division{
	public static void main(String[] args){
		try{
		int a=10;//Integer.parseInt(args[0]);
		int b=20;//Integer.parseInt(args[1]);
		int c=a/b;
		System.out.println(c);
		System.out.println("Hello World!");
	}
	catch(ArrayIndexOutOfBoundsException aiob){
		System.out.println("Please pass atleast two integer values");
}
catch(NumberFormatException nfe){
	System.out.println("Please pass atleast two integer value");
}
catch(ArithmeticException ae){
	System.out.println("Please Donot pass second value as Zero");
    }
  }
}
