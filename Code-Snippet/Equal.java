class  Equal
{
	public static void main(String[] args) 
	{
		String str = "Hello World";
		if(str.equals("Hello World"))
			System.out.println(str);
		if("Hello World".equals(str))
			System.out.println(str);
		System.out.println(str=="Hello World");
	}
}