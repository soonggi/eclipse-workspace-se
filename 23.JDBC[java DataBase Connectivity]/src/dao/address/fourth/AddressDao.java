package dao.address.fourth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
Dao(Data Access Object)
 - Address들의 데이터를 저장하고있는 Address 테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위(???)메쏘드를 가지고있는 클래스
 - AddressService객체의 요청(메쏘드호출)을 받아서 
   Data Access(DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 */
public class AddressDao {
	
	public Address selectByNo(int no) throws Exception{
		/*************************DB접속정보***************************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		/*******************************************************/
		Address findAddress=null;
		String selectSql = "select no,id,name,phone,address from address where no = ?"; 
					
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		pstmt.setInt(1, no);
		
		ResultSet rs=pstmt.executeQuery();
		
		
		while (rs.next()) {
			
			int n=rs.getInt("no");
			String id=rs.getString("id");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");
			findAddress=new Address(n, id, name, phone, address);
			//System.out.println(no+"\t"+id+"\t"+name+"\t"+phone+"\t"+address);
			
		}
		
		rs.close();
		pstmt.close();
		con.close();
		return findAddress;
	}
	
	public ArrayList<Address> selectAll() throws Exception{
		/*************************DB접속정보***************************/
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		/*******************************************************/
		ArrayList<Address> addressList = new ArrayList<Address>();
		
		String selectSql = "select no,id,name,phone,address from address"; 
					
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement pstmt = con.prepareStatement(selectSql);
		
		ResultSet rs=pstmt.executeQuery();
		
		
		while (rs.next()) {
			
			int no=rs.getInt("no");
			String id=rs.getString("id");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");
			//System.out.println(no+"\t"+id+"\t"+name+"\t"+phone+"\t"+address);
			
			Address tempAddress = new Address(no, id, name, phone, address);
			addressList.add(tempAddress);
		}
		
		rs.close();
		pstmt.close();
		con.close();
		return addressList;
	}
	
	public int insert(Address address) throws Exception{
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		
		String insertSql = "insert into address values(?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(insertSql);
		
		pstmt.setInt(1, address.getNo());
		pstmt.setString(2, address.getId());
		pstmt.setString(3, address.getName());
		pstmt.setString(4, address.getPhone());
		pstmt.setString(5, address.getAddress());
		
		int insertRowCount = pstmt.executeUpdate();
		System.out.println(insertRowCount+"행 insert");
		pstmt.close();
		con.close();
		return insertRowCount;
	}
	
	public int deleteByNo(int no) throws Exception{
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		
		String deleteSql = "delete from address where no=?";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(deleteSql);
		pstmt.setInt(1, no);
		
		int deleteRowCount=pstmt.executeUpdate();
		System.out.println(">>" + deleteRowCount + " 행 delete");
		pstmt.close();
		con.close();
		return deleteRowCount;
	}
	
	public int updateByNo(Address address) throws Exception{
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		String updateSql = "update address set id=?, name=?, phone=?, address=? where no=?";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		PreparedStatement pstmt = con.prepareStatement(updateSql);
		
		pstmt.setString(1, address.getId());
		pstmt.setString(2, address.getName());
		pstmt.setString(3, address.getPhone());
		pstmt.setString(4, address.getAddress());
		pstmt.setInt(5, address.getNo());
		
		int updateRowCount = pstmt.executeUpdate();
		System.out.println(">> "+updateRowCount+"update");
		pstmt.close();
		con.close();
		return updateRowCount;
		
		
	}
	
	
	
	/*
	public void insert(Address address) throws Exception{
		
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		
		String insertSql = "insert into address values(address_no_seq.nextval,'"+ 
					address.getId() +"','"+ 
					address.getName() +"','"+
					address.getPhone()+"','"+
					address.getAddress()+"')"; 
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
				
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		
		stmt.close();
		con.close();
	}

	
	public void insert(String id, String name, String phone, String address) throws Exception{
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		
		String insertSql = "insert into address values(address_no_seq.nextval,'"+ id +"','"+ name +"','"+phone+"','"+address+"')"; 
		
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
				
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + " 행 insert");
		
		stmt.close();
		con.close();
	}
	 */
	
	
	/*
	public void deleteByNo(int no) throws Exception{
		
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		
		String deleteSql = "delete from address where no="+no; 
				
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> " + deleteRowCount + " 행 delete");
		
		stmt.close();
		con.close();
	}
	*/
	/*
	public void updateByNo(Address updateAddress) throws Exception{
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		String updateSql = "update address set id='"+
					updateAddress.getId()+"',name='"+
					updateAddress.getName()+"',phone='"+
					updateAddress.getPhone()+"',address='"+
					updateAddress.getAddress()+"' where no = "+
					updateAddress.getNo(); 
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> " + updateRowCount + " 행 update");
		System.out.println(">> " +updateSql);

		stmt.close();
		con.close();
		
	}
	 */
	
	/*
	public void updateByNo(int no, String id, String name, String phone, String address) throws Exception{
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		String updateSql = "update address set id='"+id+"',name='"+name+"',phone='"+phone+"',address='"+address+"' where no = "+no; 
				
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> " + updateRowCount + " 행 update");
		System.out.println(">> " +updateSql);

		stmt.close();
		con.close();
	}
	*/
	
	
}
