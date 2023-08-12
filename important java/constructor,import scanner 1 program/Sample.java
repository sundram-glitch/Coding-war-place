class Sample{
	static{
System.out.println("Sample class is loaded");
	}

	public static void main(String[] args)throws ClassNotFoundException 
	{
		Class.forName("Example13");
	
	
		/*System.out.println("Sample main start");
		Example13.m1();
				System.out.println("Sample main end");*/

	}
}
