class  Test50
{
	public static void main(String[] args) 
	{
		Tutoreal t1=new Tutoreal();
		int q=18;
		System.out.println("1:"+q);
		t1.m1(q);
        System.out.println("2:"+q);

         Tutoreal t2=new Tutoreal();
            System.out.println("3t2:"+t2);
			t1.m2(t2);
		System.out.println("4t2:"+t2);

		System.out.println("5t2:"+t2);
        System.out.println("6t2.x:"+t2.x);
		t1.m3(t2);
		System.out.println("7t2:"+t2.x);
		System.out.println("8t2:"+t2);

		t1.m4(t2);
        System.out.println("9t2.x:"+t2.x);
             t1.m5(t2);
		System.out.println("9t2.x:"+t2.x);
	}
}
/*1:18
2:18
3t2:Tutoreal@3e3abc88
4t2:Tutoreal@3e3abc88
5t2:Tutoreal@3e3abc88
6t2.x:10
7t2:15
8t2:Tutoreal@3e3abc88
9t2.x:15
9t2.x:19*/

