class Switch_With_String{
	static void m1(String name){
		switch(name){
			case "PK":
				System.out.println("PK is hero number 1");
			case "MB":
				System.out.println("MB is hero number 2 ");
			case "Jr.NTR":
		        System.out.println("Jr.NTR is hero number 3");
			default:
			    System.out.println(name+"number is not decided");   
		}
	}
	public static void main(String[] args){
		m1("PK");
		m1("MB");
		m1("Jr.NTR");
		m1("Prabhas");
		System.out.println("Hello World!");
	}
}
