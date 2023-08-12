//CCC
class CCC_AUB{

	public static void main(String[] args){
		byte b =new Byte((byte) 40).byteValue();
		short s =new Short((short) 50).shortValue();
		int i =new Integer(60).intValue();
		long l =new Long(70L).longValue();
		float f =new Float(80F).floatValue();
		double d =new Double(90D).doubleValue();
		char ch = new Character((char)97/*or 'a'*/).charValue();
		boolean bo =new Boolean(true).booleanValue();
		System.out.println("B:"+b);
		System.out.println("S:"+s);
		System.out.println("I:"+i);
		System.out.println("L:"+l);
		System.out.println("F:"+f);
		System.out.println("D:"+d);
		System.out.println("CH:"+ch);
		System.out.println("BO:"+bo);
		System.out.println("end of main!");
	}
}