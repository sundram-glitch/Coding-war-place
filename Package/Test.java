//How To create package into different location and how to communicate with them
package nit;
class  Test
{
	public static void main(String[] s) 
	{
		System.out.println("This is package program!");
	}//javac -d F:\Package Test.java
}//set classpath=.;F:Package:-java nit.Test
