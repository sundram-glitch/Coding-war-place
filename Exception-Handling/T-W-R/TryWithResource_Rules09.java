//Rule#9: Inside try(),we can not place logic,compiler will throw error
//logic is allowed only inside try{ }

//in try(),only AutoCloseable type variable declaration is allowed
//with initialization either with new Keyword or with method call with null

import java.io.*;

class  TryWithResource_Rules09{
	public static void main(String[] args){
		System.out.println("start!");
		try(PrintStream pw = new PrintStream(System.out);
					//pw.println("hI")
			FileOutputStream fis = new FileInputStream("abc.txt");
			//int a = fis.read();
			Connection con = DriverManager.getConnection(null,null,null);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("");
			//rs.next();
			//boolean bo = rs.next();
					){ }
	}
}
