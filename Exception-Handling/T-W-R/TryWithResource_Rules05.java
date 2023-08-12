//Rule#5: We can not assign new Object or null
//to the resource variable inside try body
import java.io.*;
import java.sql.*;

class TryWithResource_Rules05{
	public static void main(String[] args){
		System.out.println("start!");
		try(PrintStream ps = new PrintStream("abc.txt");){
		//ps = new PrintStream("bbc.txt");
		//ps = null;
		}
       /* try(PrintStream ps){
			ps = new PrintStream("abc.txt");
		}*/
	}
}
