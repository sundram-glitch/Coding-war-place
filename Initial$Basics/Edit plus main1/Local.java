class Local 
{
   static int a=10;
   static int b=20;
	public static void main(String[] args) 
	{
		System.out.println(a+" "+b);
		int a=30;

		System.out.println(a+" "+b);
	}
}
/*10 20
30 20
Viz call . . .*/