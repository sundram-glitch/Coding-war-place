//Rule#4: Also we can not create object without
//variable declaration,else
//we will get CE: <identifier>excepted
import java.io.*;
import java.sql.*;

class TryWithResource_Rules04{
	public static void main(String[] args){
		System.out.println("start!");
    try(new PrintStream("abc.txt");){
	}
	//for calling close() method on above object,
	//compiler requires variable
  }
}
