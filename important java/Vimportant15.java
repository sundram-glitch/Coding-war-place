class Vimportant15{
	 int x=20;
	 class H{
		 int x=50;
		 void m1(){
			 System.out.println("X"+x);
			 System.out.println("THIS.X"+this.x);
			 System.out.println("Vimportant15.this.x"+Vimportant15.this.x);
	 }
	 void m2(){
		 int x=60;
		 System.out.println("X"+x);
		 System.out.println(this.x);
		 System.out.println(Vimportant15.this.x);
	 }

}
     void m3(){
		 System.out.println(x);
		Vimportant15 b=new Vimportant15();
		 System.out.println(b.x);
	 }
	public static void main(String[] args) 
	{
		   Vimportant15 a=new Vimportant15();
		   a.m3();
		   	Vimportant15.H b=new Vimportant15().new H();
			b.m1();
			b.m2();
		System.out.println("main method end");
	}
}
