class  Arrays04{
	//int[] a;/*non-static variable a cannot be referenced from a static context*/
	//static int []a; NPE
	static int []a =new int[10];
	public static void main(String[] args){
		
		System.out.println("Hello World!");
	
		for (int i=0;i<10;i++)
		{
		a[i]=i*i;	
	System.out.println("a["+i+"]:"+a[i]);
		}
	}
}
