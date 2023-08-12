// A simple Java program to demonstrate multiple 
// inheritance through default methods. 
interface Example02 
{ 
	// default method 
	default void show() 
	{ 
		System.out.println("Default Example02"); 
	} 
} 

interface TestInterface2 
{ 
	// Default method 
	default void show() 
	{ 
		System.out.println("Default TestInterface2"); 
	} 
} 

// Implementation class code 
class TestClass implements Example02, TestInterface2 
{ 
	// Overriding default show method 
	public void show() 
	{ 
		// use super keyword to call the show 
		// method of TestInterface1 interface 
		Example02.super.show(); 

		// use super keyword to call the show 
		// method of TestInterface2 interface 
		TestInterface2.super.show(); 
	} 

	public static void main(String args[]) 
	{ 
		TestClass d = new TestClass(); 
		d.show(); 
	} 
} 
