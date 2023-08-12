class TPlus 
{
	public static void main(String[] args) 
	{
		int a=3,b;
		b=++a+a++*++a;
		System.out.println(b);
		a=3;
		System.out.println((++a)+" "+" "+(a++)+" "+(++a));
		b=(++a+a++)*++a;
	    System.out.println(b);
	}
}
