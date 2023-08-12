/**V.imp var values point of view here while class loading 
  *into jvm all static members like svs got initialized and 
  *they got their initial values like 0's*/
class C{
	static int a=10;
	static{
    System.out.println("From SB");
	System.out.println("a:-"+a);
	//System.out.println("b:-"+b);//illegal_forward_reference
    //System.out.println("b:-"+C.b);//o/p-0
	//b=70;
    System.out.println("b:-"+C.b);//based on SB values ini
	m1();
	}
	static void m1(){
    System.out.println("C M1()");
	System.out.println("value of b"+b);//based on SB values ini
	}
	public static void main(String[] args) 
	{
	System.out.println("from main method!");
    System.out.println("a:-"+a);
	System.out.println("b:-"+b);
	}
	static int b=20;
}
