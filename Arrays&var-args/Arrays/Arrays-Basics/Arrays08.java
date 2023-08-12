class Arrays08{

	static void m11(Object obj){
		if (obj instanceof Object){	
    System.out.println("if");
	}
	else{
    System.out.println("else");
	}
}

	public static void main(String[] args){
		System.out.println("Hello World!");
		m11("");
		m11(new Test());
        m11(5);
        m11(1.);
		m11(null);// :~)`aa gya swad

	}
}
class Test{

}
