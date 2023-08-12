interface Tanaji{}
class Alpha implements Tanaji{} 
class Beta extends Alpha{}
class Delta extends Beta{
	public static void main(String[] args) 
	{  
		Beta x=new Beta();
	 Alpha	b=new Beta ();
	Beta d=new Delta();

		System.out.println("---------------------------------------");
	}
}
