class Utter 
{
	int x=909;
	int y=323;
	void m1(){
		Utter u1= new Utter();
		u1.x=99;
		u1.y=90;
	}
	public static void main(String[] args) 
	{
		Utter u2=new Utter();
		u2.m1();
		System.out.println(u1.x);
		System.out.println(u1.y);
	}
}
