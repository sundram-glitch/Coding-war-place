class  StrArr
{
	public static void main(String[] args) 
	{
        String str[] = {"10","20","30","40"};
		for(String result : str)
		{
		 if(result.contains("30"))
		 {
		 continue;
		 }
		System.out.println(result);
		}
	}
}
