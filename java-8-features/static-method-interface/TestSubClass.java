// A simple Java program to TestClassnstrate static 
// methods in java 
class TestSupClass{ 
	// abstract method 
	public void square (int a){
	System.out.println("square from TestInterface");	
	}

	// static method 
	/*private*/ static void show(){ 
		System.out.println("here only Static Method Executed"); 
	} 
} 

class TestSubClass extends TestSupClass{ 
	// Implementation of square abstract method 
	public  void square (int a){ 
		System.out.println(a*a); 
	} 
    static void show(){ 
		System.out.println("Static Method Executed"); 
	}
	public static void main(String args[]) 
	{ 
		TestSupClass d = new TestSubClass(); 
		d.square(4); 
       

		// Static method executed 
		TestSupClass.show();//static method call 
		d.show();//illegal static method call 
	} 
} 
