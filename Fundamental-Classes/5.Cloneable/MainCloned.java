// Java program to demonstrate that assignment 
// operator only creates a new reference to same 
// object. 
import java.io.*; 

// A test class whose objects are cloned 
class Test implements Cloneable{ 
	int x, y; 
	Test() 
	{ 
		x = 10; 
		y = 20; 
	} 
	@Override
	public Test clone()throws CloneNotSupportedException{
    return (Test)super.clone();
	}
} 

// Driver Class 
class MainCloned 
{ 
	public static void main(String[] args)throws CloneNotSupportedException{ 
		Test ob1 = new Test(); 
   
		System.out.println(ob1.x + " " + ob1.y); 

		// Creating a new reference variable ob2 
		// pointing to same address as ob1 
		Test ob2 = (Test)ob1.clone(); 

		// Any change made in ob2 will be reflected 
		// in ob1 
		ob2.x = 100;/*-> new Test(ob1);*/ 
        System.out.println(ob1==ob2);
		System.out.println(ob1.x+" "+ob1.y); 
		System.out.println(ob2.x+" "+ob2.y); 
	} 
} 
