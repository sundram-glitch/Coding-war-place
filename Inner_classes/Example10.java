class Example10 
{
       static class A{
	 static{
		 System.out.println("outer class is loaded");
	 }
	 static class B{
		 static {
		 System.out.println("inner class is loaded");
	 }
}

	public static void main(String[] args) 
	{
		System.out.println("inner class main");

	}
  /* public static void main(String[]args){
	   System.out.println("outer class main");*/
   }
}