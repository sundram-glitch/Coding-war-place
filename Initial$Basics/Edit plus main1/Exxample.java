class Exxample 
{
	int x;
	int y;

	 void m1(Exxample e){

/*modifying*/      x=x+1;
/*current object*/ y=y+2;
/*value*/
		 e.x=e.x+3;/*modifying argument object values*/
		 e.x=e.y+4;
	 }
	public static void main(String[] args) 
	{
		Exxample e1=new Exxample();
        Exxample e2=new Exxample();
          
         e1.m1(e2);
		System.out.println(e1.x+"....."+e1.y);
		System.out.println(e2.x+"....."+e2.y);

		e2.m1(e1);
		System.out.println(e1.x+"....."+e1.y);
		System.out.println(e2.x+"....."+e2.y);

		e1.m1(e1);
		System.out.println(e1.x+"....."+e1.y);
		System.out.println(e2.x+"....."+e2.y);

        e2.m1(e2);
		System.out.println(e1.x+"....."+e1.y);
		System.out.println(e2.x+"....."+e2.y);
	}
}
