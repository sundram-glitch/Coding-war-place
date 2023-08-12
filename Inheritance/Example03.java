class  Example03{
	 int x;
	 void m1(){
		 Example03 e1=new Example03();
		 Example03 e2=new Example03();
		 Example03 e3=new Example03();

		 System.out.println(e1.x);
		 System.out.println(e2.x);
		 System.out.println(e3.x);

	}
        void m2(){
			System.out.println(x);
		}
	public static void main(String[] args){		
		Example03 e2=new Example03();
		e2.x=15;
		e2.m1();
		e2.m2();
		Example03 e3=new Example03();
	
         e3.x=18;
		 e3.m1();
		 e3.m2();
		System.out.println("----------------------");
	}
}
