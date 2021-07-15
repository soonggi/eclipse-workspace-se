package com.itwill07.dao.phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PhoneBookDao {
	
	public void insert(PhoneBook phonebook) throws Exception {
		/*************************DB접속정보***************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		/*******************************************************/
		
		String insertSql = "insert into phonebook values(phonebook_no_seq.nextval,'"+
				phonebook.getName()+"','"+
				phonebook.getPhone()+"')";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int insertRowCount = stmt.executeUpdate(insertSql);
		System.out.println(">> " + insertRowCount + "행 insert");
		
		stmt.close();
		con.close();
		
	}
	
	public void update(PhoneBook phonebook) throws Exception {
		/*************************DB접속정보***************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		/*******************************************************/
		
		String updateSql = "update phonebook set name='"+phonebook.getName()+"',phone='"+phonebook.getPhone()+"' where no = "+phonebook.getNo();
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int updateRowCount = stmt.executeUpdate(updateSql);
		System.out.println(">> " + updateRowCount + "행 update");
		
		stmt.close();
		con.close();
		
	}
	
	public void delete(int no) throws Exception{
		/*************************DB접속정보***************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		/*******************************************************/
		
		String deleteSql = "delete from phonebook where no = "+no;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		int deleteRowCount = stmt.executeUpdate(deleteSql);
		System.out.println(">> "+ deleteRowCount + "행 delete");
		
		stmt.close();
		con.close();
	}
	
	public void selectByNo(int no) throws Exception{
		/*************************DB접속정보***************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		/*******************************************************/
		
		String selectByNoSql = "select * from phonebook where no = "+no;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		ResultSet rs=stmt.executeQuery(selectByNoSql);
		
		
		while (rs.next()) {
			
			int n=rs.getInt("no");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			System.out.println(no+"\t"+name+"\t"+phone);
			
		}
		
		rs.close();
		stmt.close();
		con.close(); 
		
	}
	
	public void selectAll() throws Exception{
		/*************************DB접속정보***************************/
		String driverClass = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		/*******************************************************/
		
		String selectAllSql = "select * from phonebook";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(selectAllSql);
		while(rs.next()) {
			int no=rs.getInt("no");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			System.out.println(no+"\t"+name+"\t"+phone);
		}
		
		rs.close();
		stmt.close();
		con.close();
	}
	
	
	
}
