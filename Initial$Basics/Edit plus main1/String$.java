class  String$
{
	static int a =10;
	static int b=34; 
	static int c=445;
     static int d=45;
	public static void main(String[] args) 
	{
		
		System.out.println("a:"+a);//1
		System.out.println("b:"+b);//2
		String$ s1=new String$();
             s1.m1();
	}
	public static void m1(){
		System.out.println("c:"+c);//3
        System.out.println("d:"+d);//4
	}//acc to calling method are printing
}