class Sample02 extends Example02 {
	void add(int a,int b) {
		System.out.println("add(int a,int b)in sample");
		System.out.println("The addition of "+a+"and"+b+"is:"+(a+b));
	}
	void sub(int a,int b){
		System.out.println("Sample sub (int a,int b):"+(a-b));
	}
	public static void main(String ...args){
	Example02 s=new Sample02();
		s.add(10,20);
		s.sub(10,20);
	}
}
