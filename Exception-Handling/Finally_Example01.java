 
	class Finally_Example01{

	public static void main(String[] args){
		try{
        System.out.println("In try1");
		}
		catch(Exception e){
		System.out.println("In catch1");
		}
		System.out.println("after try1/catch2");
        try{
        System.out.println("In try2");
		}
		catch(Exception e){
		System.out.println("In catch2");
		}
        finally{
			System.out.println("After try/catch/finally");
		}
	}
}

