class Foo {
	int x=10;
	int y=20;

	void m1(){
		System.out.println("m1");
	}
}
class Foe extends Foo{
	int x=30;
	int y=40;

	void m2(){
		System.out.println("X"+x);
		System.out.println("Y"+y);

		System.out.println("x:"+super.x);
		System.out.println("y:"+super.y);
	}

    void m3(){
		int x=50;
		int y=60;
		System.out.println("Local x:"+x);
		System.out.println("Local x:"+y);

		System.out.println("Subclass x:"+this.x);
		System.out.println("Subclass y:"+this.y);

		System.out.println("super class x:"+super.x);
		System.out.println("super class y"+super.y);
	}
		public static void main(String[]args){
			Foo s=new Foe();
			s.m1();
			Foe sub=(Foe)s;
			sub.m2();
			sub.m3();
			
	}
}
