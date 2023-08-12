//Addition of two number without using primitive types 
class  Addition{
	public static void main(String[] args){
		Integer io1 = Integer.valueOf(50);
		Integer io2 = Integer.valueOf(60);
		Integer io3 = Integer.valueOf(io1.intValue()+io2.intValue());
		System.out.println("io3: Result = "+io3);
		System.out.println("Hello World!");
	}
}
