class  Method_with_WC{
	static void m1(Integer io){
		System.out.println("int-arg:"+io);
	}
	public static void main(String[] args){
        //m1((byte)50);
		//m1('a');
		m1(60);
		//m1(70L);
		//m1(80.45);
		System.out.println();
		//m1(new Byte((byte)50));
		//m1(new Character('a'));
		//m1(new Long(70L));
		//m1(new Double(80.45));
		System.out.println("end of main!");
	}
}
