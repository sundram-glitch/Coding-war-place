class FinalKey 
{
	static int i;
	int j;
 	static FinalKey f = new FinalKey();
	static{
      i = 10;
	  f.j = 20;
	}
	public static void main(String[] args) 
	{   
		System.out.println(i+" "+f.j);
	}
}
