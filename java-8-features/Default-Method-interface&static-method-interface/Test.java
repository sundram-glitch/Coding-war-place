interface I1{
	public void m1();

	public default void m2(){
	System.out.println("dm m2 is exe from interface I1");
	}

	public static void m3(){
	System.out.println("sm m3 is exe form interface I1");
	}
}

class C implements I1{
	@Override
	public void m1(){
    System.out.println("am m1 is exe from class c");
	}

    @Override
    public  void m2(){
	System.out.println("dm m2 is exe from interface I1");
	}
	public static int m3(){
    System.out.println("sm m3 is exe from clas C");
	return 4;
	}
    
	void m4(){
    System.out.println("\nm4 is exe from class C");
    m1();
	m2();
	m3();
	I1.m3();
	}
}

class Test{
  	public static void main(String[] args) {
    C c1=new C();
	I1 i1=new C();
	i1.m2();
	I1.m2();
	c1.m1();
	c1.m2();
	//CE:I1.m2();
	c1.m3();
	//CE:i1.m3();
	I1.m3();
	c1.m4();
	System.out.println("end of  main!");
	}
}