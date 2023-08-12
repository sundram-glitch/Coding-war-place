 
class Finally_Example02{

	public static void main(String[] args){
		try{
        System.out.println("In try1");
		System.out.println("10/0 = "+10/0);
		}
		catch(NullPointerException e){
		System.out.println("In catch1");
		}
        finally{
			System.out.println("After try/catch/finally");
		}
	}
}

