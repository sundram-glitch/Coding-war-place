class recursion 
{
	public static void main(String[] args) 
	{
		int n = 20, z;
		z = fun(n);
		System.out.println(z);
	}
	static int fun(int n ){
    if(n!=0){
	System.out.println(fun(n-5));
	System.out.println(n +"-"+fun(n-5));
	
	}
	  return n;
	}
}