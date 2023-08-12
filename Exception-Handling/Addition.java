class Addition{
	public static void main(String[] args){
		int res = Addition.add(args);
		System.out.println("Result:"+res);
	}
	static int add(String[] args){
		int res = -1;
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			res = 4;
		System.out.println("inside try");
		}
		catch(ArrayIndexOutOfBoundsException e){
 		System.out.println("inside catch of AIBE");	
			res = 5;
		            /*return res;*/ 

		}
		catch(NumberFormatException e){
		System.out.println("Inside catch of NPE");
			res = 7;
		}
		System.out.println("after try/catch");
            return res; 
	}
}
