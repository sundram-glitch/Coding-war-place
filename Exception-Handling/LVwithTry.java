class LVwithTry{
	public static void main(String[] args){
		int a = -1;
		try{
			a=10;
		System.out.println("In try a:"+a);// no exce rise
		System.out.println("In try a:"+a/0);// AE rise
		System.out.println("In try a:"+a);//NPE rise
		}
        catch(ArithmeticException e){
			a = 20;
		System.out.println("In catch a:"+a);
		}
		finally{
		System.out.println("In finally a:"+a);
		}
        System.out.println("after try/catch/finally a:"+a);
	}
}
