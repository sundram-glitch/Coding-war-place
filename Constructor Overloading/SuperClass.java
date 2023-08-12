class SuperClass{
	SuperClass(){
		this(10);
		System.out.println("superclass no-args");
	}
	SuperClass(int a){
		this("abc");
		System.out.println("abc");
		System.out.println("superclasss int-args");
	}
	SuperClass(String s){
		System.out.println("superclass String-args");
	}
}
