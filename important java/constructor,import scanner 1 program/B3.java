class A3 {
	int x=m1();
	int m1(){
		System.out.println("A NSV");
		return 10;
	}
	{
		System.out.println("A NAB");
	}
	A3(){
		System.out.println("A CONSTRUCTOR");
	}
}
 class B3 extends A3{
 int y=m2();
 int m2(){
	 System.out.println("A NSV");
	 return 20;
 }
	 {
		 System.out.println("A NSV");

	 }
 
	 B3(){
		System.out.println("B CONSTRUCTOR");
	 }
	public static void main(String[] args){
		System.out.println("B main!");
		B3 b1=new	B3();
		System.out.println("\n B man x:"+b1.x);
		System.out.println("\n B man x:"+b1.y);

		}
}
