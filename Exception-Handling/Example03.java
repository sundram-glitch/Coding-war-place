//Outer catch is matched that's why cursor move outside of the inner excetion to outer matched exception
class Example03{

	public static void main(String[] args){
		//System.out.print(10/0); Handled by JDH
	try{
        System.out.println("In outer try1");
		//System.out.print(10/0);
	    try{
		System.out.println("in inner  try1");
		System.out.print(10/0);
		}
        catch(ArithmeticException e){
        System.out.println("In inner catch1");
		System.out.print(10/0);//go outside catch block and found matching catching exception
		}
		System.out.println("after inner try1/catch1");
	} catch(ArithmeticException e){
		System.out.println("In outer catch1");
		}	
 	 catch(IllegalArgumentException e){
		System.out.println("In outer catch1");
		}
		System.out.println("after outer try1/catch1");
         return ;
	}
	public static void main(String args){

	}
}