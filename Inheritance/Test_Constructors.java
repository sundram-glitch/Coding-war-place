class Test_Constructors{
	public static void main(String[] args){
		Example06 e1=new Example06(5);
        Example06 e2=new Example06(new Integer(6));
		Example06 e3=new Example06("7");
		System.out.println("--------------------------------");
		System.out.println("e1.getX"+e1.getX());
		System.out.println("e1.getX"+e2.getX());
		System.out.println("e1.getX"+e3.getX());
	}
}
