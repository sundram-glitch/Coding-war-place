class  Example03{
	static void m1(char ch){
		System.out.println("char-arg");
	}
	static void m1(long l){
		System.out.println("long-arg");
	}
	static void m1(float f){
		System.out.println("float-arg");
	}
	static void m1(Object obje){
		System.out.println("Oject-arg");
	}
	public static void main(String[] args){
		m1(50);
		m1('a');
		m1(new Integer(50));
		m1(new Character('a'));
		m1(new Long(79));
		m1(80.45);
		System.out.println("end of main!");
	}
}
