
class A{
   
}
class B extends A {
   
}
class C extends B{
	
}
class D extends A{
  
}
class  Testing
{
	public static void main(String[] args) 
	{
		A a=new A();
		Example.m1(new A());
        B b=new B();
        Example.m1(new B());
        C c=new C();
		Example.m1(new C());
        D d=new D();
		Example.m1(new D());
        String s=new String();
		Example.m1(new String());
        Object o=new Object();
		Example.m1(new Object());

		System.out.println("Main method Execute");
	}
}
