class Sample01 extends Example19 {
	static int b=m3();
	static{
		System.out.println("Sample SB");
	}
	int y=m4();
	{
		System.out.println("Sample NSB");
	}/*ample19 SV created
Example19 SB
Sample SV is Created
Sample SB
Sample main
Example19 NSV is created
Example19 NSB
Example19 Construtor
Sample NSV is Created
Sample NSB
Sample Constructor
abc
Example19 bbc*/
	Sample01(){
		System.out.println("Sample Constructor");
	}
	static int m3(){
		System.out.println("Sample SV is Created ");
		return 30;
	}
	int m4(){
		System.out.println("Sample NSV is Created");
	     return 40;
	}
	void abc(){
		System.out.println("Sample abc");
	}

	public static void main(String[] args) 
	{
		System.out.println("Sample main");
		Sample01 s=new Sample01();
		s.abc();
		s.bbc();
		System.out.println("Hello World!");
	}
}
