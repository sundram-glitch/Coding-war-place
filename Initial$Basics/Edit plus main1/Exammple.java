class Exammple 
{
	int x=40;
      void m1(Exammple e){
/*System.out.println("object value before modification");
System.out.println(x);*/
    int x=43;
    System.out.println("object value after modification");
	System.out.println(x);
     System.out.println(x);
	/*System.out.println(e1.x); can not call directly instance variable from another method it only call from main method */
	}
	public static void main(String[] args) 
	{
		Exammple e1=new Exammple();
		Exammple e2=new Exammple();
		
		//like it.
		System.out.println("object value before modification");
        System.out.println(e1.x);
        e1.m1(e2);
        System.out.println("object value after modification");
	    System.out.println(e2.x);
        System.out.println(e2.x);
	}
}
