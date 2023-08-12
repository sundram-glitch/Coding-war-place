class A{
	int a;
	public static void main(String[] args){
		System.out.println("Start of main!");
		A a=new A();
		System.out.println(a.a);
	}
}//we have to create object to access
//becoz no memory will be allocated by defautl

class A1{
   static int a;
	public static void main(String[] args){
		System.out.println("Start of main!");
		//A a=new A(); Optional
		System.out.println(a);
	}
}//here object creation is optional      
//becoz here by default memory will be allocated

