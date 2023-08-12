package CallableStatement;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class Problem1 {
/**4/2/2022
	 * @author Sundram Dubey_21868788
	 * superset id : 763985
	 **/

	Float getSalary(int empid,Connection conn) throws SQLException {
		
		CallableStatement cstmt;
		cstmt = conn.prepareCall("{call netSal(?,?)}");
		cstmt.setInt(1, empid);
		cstmt.registerOutParameter(2, Types.FLOAT);
		cstmt.execute();
		float netSal = cstmt.getFloat(2);
		return netSal;
	}
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		
		//int empid = 100;
		//float netSal;
		String query;
		Statement stmt;
		
		Problem1 p1 = new Problem1();
		//netSal = p1.getSalary(empid,conn);
		
		query = "select employee_id,first_name,last_name from employees";
		stmt = conn.prepareStatement(query);
		ResultSet rst = stmt.executeQuery(query);
		
		System.out.println("empno.\tename\t\tnet salary");
				
		while(rst.next()) {
			
			System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+" "
					+ rst.getString(3)+"\t"+p1.getSalary(rst.getInt(1),conn));
		}
		
		conn.close();
	}
}





