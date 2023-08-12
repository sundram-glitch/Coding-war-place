class  Company1
{
	public static void main(String[] args) 
	{

		Employee2 e1=new Employee2();
		e1.display();

		e1.setEno(23098);
		e1.setEname("sundram");
		e1.setSal(40000);
        /*e1.getSal();*/
		e1.display();
		

		e1.setSal(e1.getSal()+e1.getSal()*20/100);
	

		System.out.println("ans:"+e1.getSal());
	}
}
