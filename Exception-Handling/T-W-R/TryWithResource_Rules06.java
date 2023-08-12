//Rule#6: We can not use try{ } outside created object
//variable as try-resource compiler will throw error
import java.io.*;
import java.sql.*;

class TryWithResource_Rules06{
	public static void main(String[] args){
		System.out.println("start!");
		PrintStream ps = new PrintStream("abc.txt");
		//try(ps){ }
		//Note: if we want to use outside try{ } created objects as
		//try resource,we must create a local variable in try()
		//and assign that outer object to this local-var
		FileOutputStream fos = new FileOutputStream("abc.txt");
		try(FileOutputStream fos2 = fos){
		
		}
        //Java 9v enhanchcement in try-with-resource from Java-9v
		//we no need to create local variable to use the object as
		//try() resource that is create outside of try(){ }
		//we can directly access them by using the same ref var
		FileOutputStream fos3 = new FileOutputStream("abc.txt");
		try(fos3){
			fos3.write('a');
		}
	}
}
