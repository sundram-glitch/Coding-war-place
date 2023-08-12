class FCE{
	public static void main(String[] args){
		byte b1 = 50;
		int i1 = b1;

		int i2 = 50;
		//byte b2 = i2 ; plc
		byte b3 = (byte)i2;

		int i3 = 'a';
		double d1 = 50;
		double d2=60L;
		double d3=70.79f;
		double d4=43.43d;
		System.out.println("b1:"+b1);
		System.out.println("i1:"+i1);
		System.out.println("i2:"+i2);
		//System.out.println("b2:"+b2);
		System.out.println("b3:"+b3);
		System.out.println("i3:"+i3);
		System.out.println("d1:"+d1);
		System.out.println("d2:"+d2);
        System.out.println("d3:"+d3);
		System.out.println("d4:"+d4);
        System.out.println();
		//byte b12 = new Integer(50);
		int i12 = new Byte((byte)50);
		int i121 = new Integer(50);
		//byte b12 = new Integer(i2);
		//byte b13 =(byte)new Integer(i2);
		byte b14=(byte)new Integer(i2).intValue();
		int i13 =(int) new Character('a');
		double d11 = new Integer(50);
		double d12 = new Long(60L);
		double d13 = new Float(70.34f);
		double d14 = new Double(30.45);
		//double d15 = new Boolean(true);
		//System.out.println("b1:"+b12);
		System.out.println("i1:"+i12);
		System.out.println("i2:"+i121);
		//System.out.println("b2:"+b2);
		//System.out.println("b3:"+b12);
		//System.out.println("b3:"+b13);
		System.out.println("b14:"+b14);
		System.out.println("d1:"+d12);
		System.out.println("d2:"+d12);
        System.out.println("d3:"+d13);
		System.out.println("d4:"+d14);
		System.out.println("end of main!");
	}
}
