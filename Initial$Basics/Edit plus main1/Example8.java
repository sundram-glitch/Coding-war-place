class Example8 
{
	 Example8(){

		 System.out.println("constructor");
	 }
	 Example8(){
		 System.out.println("in method");
	 }

	public static void main(String[] args) 
	{
		Example8 e=new Example8();

		System.out.println("Hello World!");
		/*e.Example8();*/

	}
}
