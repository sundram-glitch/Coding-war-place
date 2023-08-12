class Example02{

	public static void main(String[] args){
	try{
        System.out.println("In outer try1");
	    try{
		System.out.println("in inner  try1");
		} catch(ArithmeticException e){
        System.out.println("In inner catch1");
		}
		System.out.println("after inner try1/catch1");
	} catch(ArithmeticException e){
		System.out.println("In outer catch1");
		}
		System.out.println("after outer try1/catch1");

	}
}