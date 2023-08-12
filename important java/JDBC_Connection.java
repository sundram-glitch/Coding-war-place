import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.*;
public class  JDBC_Connection{
	public static void main(String[] args)throws Exception{
		System.out.println("chaliye suru karte hai!");
    Connection  con=null;
	try{
	//load jdbc driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	/*oracle.jdbc.driver.OracleDriver driver=new  oracle.jdbc.driver.OracleDriver();
	DriverManager.registerDriver(driver);*/
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
    if(con==null)
		System.out.println("connection failed");
	else
		System.out.println("connection established");
	}
	catch(SQLException sql){
	sql.printStackTrace();
	}
	catch(ClassNotFoundException cse){
    cse.printStackTrace();
	}
	finally{
    try{
    if(con!=null)
		con.close();
	}
	catch(SQLException sql){
    sql.printStackTrace();
	}
   }
  }
 }

