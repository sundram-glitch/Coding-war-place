class Ex {
	final void m1(int x){
		System.out.println("x:"+x);
	}
}
class Sa extends Ex{
		void m1(int x){
			System.out.println("X"+x);
	}
	public static void main(String[] args){
		Ex e=new Sa();
		e.m1(10);
		System.out.println("Hello World!");
	}
}
