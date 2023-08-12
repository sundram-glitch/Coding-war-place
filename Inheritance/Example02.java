class Example02{
	int x=10;
	int y=20;
	void m1(int p){
		System.out.println("Passing value:"+p);
		p=50;
		System.out.println("Modified value:"+p);
	}
	void m2(Example02 e){
	System.out.println("Passing obj original values:");
    System.out.println(e.x+"               "+e.y);
	e.x=5; e.y=6;
	System.out.println("Passing obj modified values:");
	System.out.println(e.x+"               "+e.y);
	}
	public static void main(String[] args){
		Example02 e1=new Example02();
		int q=20;
		System.out.println("q value before calling m1/90 method:"+q);
		e1.m1(q);
		System.out.println("q value after calling m1/90 method:"+q);
		System.out.println("=============================");
		Example02 e2=new Example02();

		System.out.println("q value before calling m1/90 method:"+e2.x+"                          "+e2.y);
		e1.m2(e2);
		System.out.println("q value after calling m1/90 method:"+e2.x+"                    "+e2.y);

	}
}
