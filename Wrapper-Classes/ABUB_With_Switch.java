class ABUB_With_Switch{
	static void m1(Integer io){
		switch(io){
			case 1:
				System.out.println("Case 1");
			break;
			case 2:
				System.out.println("case 2");
			default:
				System.out.println("default");
		}
	}
	public static void main(String[] args){
		m1(1);
		m1(2);
		m1(3);
		m1(-1);
		m1(null);//NPE
		System.out.println("Hello World!");
	}
}
