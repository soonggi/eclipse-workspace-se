package dao.address.fourth;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Connection을 생성하고 반환(해지)하는 역할을 하는 클래스
 *  - Dao객체들이 사용
 */
public class DataSource {
	
	public Connection getConnection() throws Exception{
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper58";
		String password = "javadeveloper58";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		return con;
		
	}
	
	public void releaseConnection(Connection con) throws Exception{
		con.close();
		
	}

}
