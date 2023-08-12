class Example17 
{
	 static class Q
	 {
		 static int a=34;
		 int x=94;
		 private int y=34;

	 }
	 class Sample
	 {
		 
	 }
	public static void main(String[] args) 
	{
		System.out.println("A"+Example17.Q.a);
		Example17.Q q=new Example17.Q();
		System.out.println("x:"+q.x);
        System.out.println("y:"+q.y);
		System.out.println("Hello World!");
	}

}