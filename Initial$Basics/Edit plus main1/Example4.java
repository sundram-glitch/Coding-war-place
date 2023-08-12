class Example4
{

	 int x;
	 int y;
 
    void m1(Example4 e){

		x=1;
		y=2;

		x=3;
		y=4;
	}
	public static void main(String[] args) 
	{
         Example4 e1=new Example4();
		 Example4 e2=new Example4();
         
		 e1.m1(e2);
        System.out.println(e1.x+":!:"+e1.y);
		System.out.println(e2.x+":2:"+e2.y);

		e2.m1(e1);
		System.out.println(e1.x+":3:"+e1.y);
		System.out.println(e2.x+":4:"+e2.y);

		e1.m1(e1);
          System.out.println(e1.x+":5:"+e1.y);
		System.out.println(e2.x+":6:"+e2.y);

		e2.m1(e2);

		   System.out.println(e1.x+":7:"+e1.y);
		System.out.println(e2.x+":8:"+e2.y);
	}

}
