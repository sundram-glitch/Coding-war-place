class  Exmaple01{
	int x=10;
	int y=20;
	void m1(Exmaple01 e){
System.out.println("passing origanal values");
System.out.println(x+"-------"+y);

 x=6; y=7;

System.out.println("passing modified values");
System.out.println("x"+x+"-------------"+"y"+y);
System.out.println("this.x:"+this.x+"-------------"+"this.y:"+this.y);
System.out.println("e2.x:"+e2.x+"-------------"+"e2.y:"+e2.y);
	}
public static void main(String[] args){
	System.out.println("Passing  obj 1 reference");
	Exmaple01 e1=new Exmaple01();
	Exmaple01 e2=new Exmaple01();
	System.out.println("e1 reference values before calling m1");
    System.out.println("e2.x"+e2.x+"----------------------"+"e2.y"+e2.y);
	System.out.println("Passing e2 reference as argument");

	e1.m1(e2);

	    System.out.println("e2.x"+e2.x+"----------------------"+"e2.y"+e2.y);

		System.out.println("------------------------------------------");
	}
}
