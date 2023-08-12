 //Rule#1:The resource's variable and object both must be AutoCloseble type
import java.io.*;
import java.sql.*;
class TryWithResource_Rules01{
	public static void main(String[] args)throws FileNotFoundException,IOException,SQLException{
		System.out.println("start!");
  
	try(PrintStream ps = new PrintStream(System.out)){
		ps.println("hi");
	}
	//try(String s = "a"){}
    //try(Object obj = new PrintStream(System.out)){}
    //try(AutoCloseable ac = new PrintStream(System.out)){}
  }
}

