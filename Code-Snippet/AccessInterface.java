interface Im{
	final int n0 = 0;
	 void main();
	public static void main(String[]args){
      System.out.println("Im");
	}
}
class AccessInterface 
{
	public static void main(final  String[] args) 
	{   
		Im.main(new String[]{"212"});
		System.out.println("Hello World!"+Im.n0);
	}
}
