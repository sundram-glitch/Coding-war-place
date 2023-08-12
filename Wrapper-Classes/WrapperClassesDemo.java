class  WrapperClassesDemo{

	public static void main(String[] args){
		//1. PDT=>wco conversion
		int i=50;
		Integer io1=new Integer(i);
		Integer io2=Integer.valueOf(i);
        System.out.println("i:"+i);
		System.out.println("io1:"+io1);
		System.out.println("io2:"+io2);
		System.out.println(io1==io2);
        System.out.println();
        //Find out compile-time errors in the below lines of code:
		//Byte b1=new Byte(50);
		Byte b2=new Byte((byte)50);
		
		//System.out.println("b1:"+b1);
		System.out.println("b2:"+b2);
        System.out.println();
        //Character ch1=new Character(97);
		Character ch2=new Character('a');
        Character ch3=new Character((char)97);
		Boolean   bo =new Boolean(true);
		//System.out.println("CH1:"+ch1);
		System.out.println("ch2:"+ch2);
		System.out.println("ch3:"+ch3);
		System.out.println("bo:"+bo);
		System.out.println();
		Float f1 = new Float(70);
		Float f2 = new Float(32.56f);
		Float f3 = new Float(50.45);
		Double d1 = new Double(67.54);
		Double d2 = new Double(98);
		Double d3 = new Double('a');
		System.out.println("f1:"+f1);
		System.out.println("f2:"+f2);
		System.out.println("f3:"+f3);
		
		//2.WCP=>PDT conversion
		Integer io3= Integer.valueOf(254);
		int x = io3.intValue();
		byte b = io3.byteValue();
		short s= io3.shortValue();
		float f= io3.floatValue();
		System.out.println("X:"+x);
		System.out.println("b:"+b);//-2...?
		System.out.println("s:"+s);
		System.out.println("f:"+f);
		//Find-out compile time errors in the below lines of code
		//char ch1 = io3.charValue();
		//char ch2 = io3.intValue();
		char ch31 = (char)io3.intValue();
        System.out.println();
		//System.out.println("ch1:"+ch1);
		//System.out.println("ch2:"+ch2);
		System.out.println("ch3:"+ch3);
        System.out.println();
		//boolean bo1 = io3.booleanValue();
		//boolean bo2 = io3.intValue();
		//boolean bo3 = (boolean)io3.intValue();
		//System.out.println("bo1:"+bo1);
		//System.out.println("bo2:"+bo2);
		//System.out.println("bo3:"+bo3);
		//3.PSO=>WCO Conversion
		Integer io11=new Integer("10");
		Integer io22 = Integer.valueOf("1");
        System.out.println("io1:"+io11);
		System.out.println("io2:"+io22);
		Byte bo11 = Byte.valueOf("1");
		//Byte bo22 = Byte.valueOf("128");
		System.out.println("bo11:"+bo11);
		//System.out.println("bo22:"+bo22);
		/*Integer io33=Integer.valueOf("a");
		Integer io44=Integer.valueOf("5.4");
		Integer io55=new Integer("5L");
		System.out.println("IO33:"+io33);
		System.out.println("IO44:"+io44);
		System.out.println("io55:"+io55);*/
		System.out.println();
		Long lo1=new Long("5");
		Float fo1=new Float("5");
		Float fo2=new Float("5.4F");
		Float fo3=new Float("5.4D");
		//Float fo4=new Float("5L");
		//Float fo5 =new Float("a");
		//Character ch=new Character("a");
		System.out.println("lo1:"+lo1);
        System.out.println("fo1:"+fo1);
		System.out.println("fo2:"+fo2);
		System.out.println("fo3:"+fo3);
		//System.out.println("fo4:"+fo4);
		//System.out.println("fo5:"+fo5);
        //boolean String Object=>Boolean WCO
		//"false" | "true"=>WCO
		System.out.println();
		Boolean bo1=new Boolean("false");
		Boolean bo2=new Boolean("true");
		Boolean bo3=new Boolean("false");
		Boolean bo4=new Boolean("true");
		Boolean bo5=new Boolean("True");
		Boolean bo6=new Boolean("TrUe");
		Boolean bo7=new Boolean("FALSE");
		Boolean bo8=Boolean.valueOf("FALSE");
		Boolean bo9=Boolean.valueOf("TrUe");
		Boolean bo10=Boolean.valueOf("Hari");
		Boolean bo111=Boolean.valueOf("");
		Boolean bo12=Boolean.valueOf(null);
		//Integer io13=Integer.valueOf(null);
		//Boolean bo14=Boolean.valueOf(TRUE);
		System.out.println("bo1:"+bo1);
		System.out.println("bo2:"+bo2);
		System.out.println("bo3:"+bo3);
		System.out.println("bo4:"+bo4);
		System.out.println("bo5:"+bo5);
		System.out.println("bo6:"+bo6);
		System.out.println("bo7:"+bo7);
		System.out.println("bo8:"+bo8);
		System.out.println("bo9:"+bo9);
		System.out.println("bo10:"+bo10);
		System.out.println("bo111:"+bo111);
		System.out.println("bo12:"+bo12);
		System.out.println();
		//System.out.println("io13:"+io13);
		//System.out.println("bo14:"+bo14);
		//4.PSO=>PDT conversion
		//1.PSO=>WCO=>PDT
		//2.PSO=>PDT
		int I1=Integer.parseInt("10");
		//int I2=Integer.parseInt("10.9");
		//byte b21=Byte.parseInt("40");
		byte b212=Byte.parseByte("40");
		//byte b213=Byte.parseByte("128");
		float f11=Float.parseFloat("10");
		float f12=Float.parseFloat("50.456");
		float f13=Float.parseFloat("606.678F");
		boolean bo121=Boolean.parseBoolean("TRUE");
		boolean bo122=Boolean.parseBoolean("FALSE");
		boolean bo123=Boolean.parseBoolean("TURE");
		System.out.println("i1:"+I1);
		//System.out.println("i2:"+I2);
		//System.out.println("b1:"+b21);
		System.out.println("b2:"+b212);
		//System.out.println("b3:"+b213);
		System.out.println("f1:"+f11);
		System.out.println("f2:"+f12);
		System.out.println("f3:"+f13);
		System.out.println("bo1:"+bo121);
		System.out.println("bo2:"+bo122);
		System.out.println("bo3:"+bo123);
		System.out.println();
        //5.WCO => String object conversion
		Integer io=new Integer(299);// in background of Wrapper classes toString() method already emplicitly overriden
		String ts=io.toString();
		System.out.println("s:"+ts);
		System.out.println("io:"+io);
        //PDT=>PSO 
		//String s1=10;
		String s2="10";
		String s3=Integer.toString(10);
		String s4=Byte.toString((byte)10);
        String s6=Integer.toString('a');
		//String s7=Integer.toString("a");
		//String s8=Integer.toString(10.0);
		String s9=Float.toString(20);
		String s10=Float.toString(30L);
		String s11=Float.toString(40.0f);
		String s12=Float.toString(50.0F);
        //String s13=Float.toString(60.0);
		String s14=Boolean.toString(false);
		String s15=Boolean.toString(true);
		String s16=Boolean.toString(TRUE);
        //String s17=Boolean.toString("false");
		//String s18=Boolean.toString("true");
        //System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
        System.out.println("s4:"+s4);
        //System.out.println("s5:"+s5);
        System.out.println("s6:"+s6);
        //System.out.println("s7:"+s7);
        //System.out.println("s8:"+s8);
        System.out.println("s9:"+s9);
        System.out.println("s10:"+s10);
        System.out.println("s11:"+s11);
        System.out.println("s12:"+s12);
        //System.out.println("s13:"+s13);
        System.out.println("s14:"+s14);
        System.out.println("s15:"+s15);
        System.out.println("s16:"+s16);
        //System.out.println("s17:"+s17);
        //System.out.println("s18:"+s18);
        System.out.println("end");

		}
}
