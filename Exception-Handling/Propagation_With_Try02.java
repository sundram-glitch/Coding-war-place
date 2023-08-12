class Propagation_With_Try02{
	static void m1(){
		System.out.println("In m1 method start ");
		System.out.println("10/0:"+10/0);
		System.out.println("In m1 method end");
	}
public static void main(String[] args){
		try{
        System.out.println("In main method start ");
		m1();
		}
		catch(ArithmeticException ae){
	    System.out.println("In m1 method catch");
		}
	}
}
