//Outer catch is not matched that's why cursor move outside of the Java-defalt-handler excetion 
class Example04{

	public static void main(String[] args){
		//System.out.print(10/0); Handled by JDH
	try{
        System.out.println("In outer try1");
		//System.out.print(10/0);
	    try{
		System.out.println("in inner  try1");
		System.out.print(10/0);
		} catch(ArithmeticException e){
        System.out.println("In inner catch1");
		System.out.print(10/0);//again execp raised go outside search and finding matching catching exep but not found?
		}
		System.out.println("after inner try1/catch1");
	} catch(NumberFormatException e){
		System.out.println("In outer catch1");
		}
		System.out.println("after outer try1/catch1");

	}
}