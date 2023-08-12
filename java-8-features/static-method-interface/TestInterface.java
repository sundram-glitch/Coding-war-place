// A simple Java program to TestClassnstrate static 
// methods in java 
class TestInterface 
{ 
	// abstract method 
	//public void square (int a); 

	// static method 
	/*private*/ static void show(){ 
		System.out.println("Static Method Executed"); 
	} 
} 

class TestClass implements TestInterface 
{ 
	// Implementation of square abstract method 
	public  void square (int a) 
	{ 
		System.out.println(a*a); 
	} 
    public static void show(){ 
		System.out.println("Static Method Executed"); 
	}
	public static void main(String args[]) 
	{ 
		TestInterface d = new TestClass(); 
		d.square(4); 
       

		// Static method executed 
		//TestInterface.show();//static method call 
		d.show();//illegal static method call 
	} 
} 
