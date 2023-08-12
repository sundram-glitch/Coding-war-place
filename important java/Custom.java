class Custom 
{
    int x=10;
	void m190(){
    System.out.println("co.X"+this.x);
	System.out.println("super.x"+x);
	}
}
class Private extends Custom{
	int x=20;
	void m2(){
		System.out.println("this.x"+this.x);
		System.out.println("Super.x"+super.x);
	}
	public static void main(String[] args) 
	{
        Custom n=new Private();
        n.m190();
		Private p=(Private)n;
		p.m2();
		System.out.println("--------------------");
	}
}
