public class Source01
{
	public static void Order(String s)
	{
		System.out.println("String");
	}
	public static void Order(Object o)
	{
		System.out.println("Object");
	}
	public static void main (String [] args)
	{
		Order(null);
	}
}