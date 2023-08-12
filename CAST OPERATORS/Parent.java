class Parent{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	  Parent p = new Child();
	  SM();
	  Child c=(Child)p;
	}
   static void SM(){
    System.out.println("parent NSM");
	}
}

class Child extends Parent{
 
 static void SM(){
    System.out.println("parent NSM");
	}
 
}
