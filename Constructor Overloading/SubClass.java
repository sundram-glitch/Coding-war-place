class SubClass extends SuperClass{
	SubClass(){
		this(10);
		System.out.println("Subclass no-args");
	}
	SubClass(int a){
		this("abc");
		System.out.println("abc");
		System.out.println("suberclasss int-args");
	}
	SubClass(String s){
		System.out.println("subclass String-args");
	}
	public static void main(String[] args) 
	{
		new		SubClass();
		System.out.println();
		new SubClass(10);
		System.out.println();
        new SubClass("abc");
		System.out.println("==============================================");
	}
}
