//Rule#3: The resource variable must be initailized either
//with an object or with method call or at least with null
//else we will get Cerror: = expected
import java.io.*;
import java.sql.*;
class TryWithResource_Rules03{
	public static void main(String[] args)throws Throwable{
		System.out.println("start!");
    try(PrintStream ps = new PrintStream("abc.txt")){
	System.out.println("In try ");
	}
	try(PrintStream ps = null){
		System.out.println("In try 2");
	}
    try(PrintStream ps){
    System.out.println("In try 3");
	}
	//This rule is created because initially by using 
	//resource variable close() method is called.
	//if we do not initialize resource variable,close()
	//method can not be invoked.
	//it's basic variable accessing rule.
  }
}