class StaticMember
{
	int x=97;
	int y=98;

	void m1(){
      StaticMember s1=new StaticMember();
	  s1.x=979;
	  s1.y=9887;
	 /*System.out.println(s1.x+"  "+s1.y);
	  System.out.println(s1.x+"  "+s1.y);*/
	}

	public static void main(String[] args) 
	{
           StaticMember s2=new StaticMember();

		System.out.println(s2.x+"  "+s2.y);
		s2.m1();
         
		 System.out.println(s2.x+"  "+s2.y);
		 /* System.out.println(s1.x+"  "+s1.y);
	      System.out.println(s1.x+"  "+s1.y);*/ //it does not possible to apply as where the object calling funtion must be there


	} 
}
/*97  98
979  9887
979  9887
97  98
Press any key to continue . . .*/

