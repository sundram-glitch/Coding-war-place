class  Method_with_PDT{
	static void m1(int a){
		System.out.println("int-arg:"+a);
	}
	public static void main(String[] args){
        m1((byte)50);
		m1('a');
		m1(60);
		//m1(70L);
		//m1(80.45);
		System.out.println();
		m1(new Byte((byte)50));
		m1(new Character('a'));
		//m1(new Long(70L));
		//m1(new Double(80.45));
		System.out.println("end of main!");
	}
}
