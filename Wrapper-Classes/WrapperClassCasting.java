class WrapperClassCasting{

	public static void main(String[] args){
		Byte b1=new Byte((byte)10);
		//Integer i1=(Integer)b1;//CE: can not be converted into integer
		Integer i3=new Integer(10);
		//System.out.println(b1==i3);CE: incompatible
		System.out.println("i3:"+i3+"b1:"+b1);
	}
}
