class Recheck 
{
	   static int a=10;
       static int b=20;

       int x=30;
	   int y=40;
	public static void main(String[] args) 
	{
        System.out.println("a:"+a);
		System.out.println("a:"+b);

	    /*System.out.println("x:"+Recheck.x);
		System.out.println("y:"+Recheck.y);=>wrong approach */
        System.out.println("a:"+Recheck.a);
		System.out.println("b:"+Recheck.b);
        Recheck s=new Recheck();

		Recheck ee=null;
System.out.println(ee.x);
		System.out.println(ee.y);
        System.out.println("x:"+s.x);
		System.out.println("y:"+s.y);
        
        System.out.println("a:"+s.a);
		System.out.println("b:"+s.b);

        System.out.println("x:"+s.x);
		System.out.println("y:"+s.y);

        Recheck cs=null;
        System.out.println(cs.a);
		System.out.println(cs.b);

        
		


        

	}
}
/*a:10
a:20
a:10
b:20
x:30
y:40
a:10
b:20
x:30
y:40
10
20
*/