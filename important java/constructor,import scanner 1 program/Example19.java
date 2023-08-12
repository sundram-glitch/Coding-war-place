class Example19 {
	static int a=m1();
	static{
		System.out.println("Example19 SB");
	}
	int x=m2();
	{
		System.out.println("Example19 NSB");
	}

	Example19(){
		System.out.println("Example19 Construtor");
	}
	static int m1(){
          System.out.println("Example19 SV created");
		  return 10;
	}

	int m2(){
        System.out.println("Example19 NSV is created");
		return 20;
	}
	void abc(){
		System.out.println("Example19 abc");
	}
	void bbc(){
		System.out.println("Example19 bbc");
	}
}
