class  WrapperClassesComparison{
	
	public static void main(String[] args){
		int i1=10,i2=10;
		System.out.println(i1==i2);
		//System.out.println(i1.equals(i2));//CE:Int can not be derefernced
		Integer io1=new Integer(10);
		Integer io2=new Integer(10);
		System.out.println(io1==io2);
		Double do1=new Double(10.0);
		//System.out.println(io1==do1);CE:incomprable types: Integer and Double 
        System.out.println(io1.equals(do1));//false
		double d1=10.0;
		System.out.println(i1==d1);//true
		System.out.println("Hello World!");
	}
}
