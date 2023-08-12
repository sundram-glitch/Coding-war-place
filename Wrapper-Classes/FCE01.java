class  FCE01{

	public static void main(String[] args){
		Integer io1 = new Integer(10);
		Integer io2 = 10;
		
		int a = new Integer(10);
		int b = io2;

		Double d1 = (double)10;
		Integer io3 = (int)'a';
        
		Byte t=(int)10;
		Byte b1 = (byte) new Integer(10).intValue();
		//Byte b2 = (int)128;

		Character ch1 = 97;
		//Character ch2 = (Character)97;
		Double d2 = 40.43;
		//Integer io4 = d2;
		int c = 'a';
		System.out.println("io1:"+io1);
		System.out.println("io2:"+io2);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("d1:"+d1);
		System.out.println("io3:"+io3);
		System.out.println("b1:"+b1);
		//System.out.println("b2:"+b2);
		System.out.println("ch1:"+ch1);
		//System.out.println("ch2:"+ch2);
		System.out.println("d2:"+d2);
		//System.out.println("io4:"+io4);
		System.out.println("c:"+c);
		System.out.println("Hello World!");
	}
}
