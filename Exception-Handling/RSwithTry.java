class RSwithTry{
	public static void main(String[] args){
		System.out.println("m1()!"+m1());
		
	}
static	int m1(){
		try{
			System.out.println("In try");
			System.out.println(10/0);
			return 10;
		}
		catch(ArithmeticException e){
			System.out.println("In catch");
		}
            System.out.println("after try/catch");
			return 80;
    }
}