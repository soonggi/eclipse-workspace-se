package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressDeleteByNoMain {

	public static void main(String[] args) throws Exception{
		/*******************************************************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		/*******************************************************/
		String deleteSql = "delete from address where no=3"; 
				
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> " + deleteRowCount + " 행 delete");
		
		stmt.close();
		con.close();

	}

}
