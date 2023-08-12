class Exception_WithOut_Exception_Handling{

	public static void main(String[] args){
		int a = 20;
		int b = 0;
		System.out.println("a value:"+a);
		System.out.println("b value:"+b);
		int c = a/b;
		System.out.println("c value!"+c);
	}
}/*O/P:-a value:20
b value:0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception_WithOut_Exception_Handling.main(Exception_WithOut_Exception_Handling.java:8)*/
