class Example11 
{
	 static {
		 System.out.println("OUTER CLASS IS LOADED");
	 }
	 static class A
	 {
		 static{
			 System.out.println("Inner class is loaded");

	 }
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
    public static void main(String[] args){
		System.out.println("outer class main");
	}
}