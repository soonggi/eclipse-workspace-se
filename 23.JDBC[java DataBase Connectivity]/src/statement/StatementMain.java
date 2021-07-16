package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class StatementMain {

	public static void main(String[] args) throws Exception {
		String driverClass= "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user = "javadeveloper28";
		String password = "javadeveloper28";
		String selectSql = "select * from emp order by sal desc";
		/*
		이름       널?       유형           
		-------- -------- ------------ 
		EMPNO    NOT NULL NUMBER(4)    
		ENAME             VARCHAR2(10) 
		JOB               VARCHAR2(9)  
		MGR               NUMBER(4)    
		HIREDATE          DATE         
		SAL               NUMBER(7,2)  
		COMM              NUMBER(7,2)  
		DEPTNO            NUMBER(2)
		 */
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		/*
		 * ResultSet의 행의 수 제한
		 */
		stmt.setMaxRows(3);
		
		System.out.println("----------------stme.executeQuery()----------------");
		ResultSet rs = stmt.executeQuery(selectSql);
		while(rs.next()) {
			System.out.println(rs.getInt("empno")+"\t"+
								rs.getString("ename")+"\t"+
								rs.getString("job")+"\t\t"+
								rs.getDouble("sal")+"\t\t"+
								rs.getDate("hiredate"));
			
		}
		rs.close();
		/*
		insert into emp values(9000,'KIM','MANAGER',null,to_date('2020/01/01','YYYY/MM/DD'), 6000, null, 40);
		update emp set sal = 6788.98 where empno >= 7369 and empno <= 7600;
		delete from emp where empno=7844;
		*/
		
		System.out.println("----------------stme.executeUpdate()----------------");
		String insertSql = "insert into emp values(9001,'KIM','MANAGER',null,to_date('2020/01/01','YYYY/MM/DD'), 6000, null, 40)";
		String updateSql = "update emp set sal = 6788.98 where empno >= 7369 and empno <= 7600";
		String deleteSql = "delete from emp where empno=9001";
		
		int rowCount=stmt.executeUpdate(insertSql);
		System.out.println(rowCount+" 행 insert");
		rowCount=stmt.executeUpdate(updateSql);
		System.out.println(rowCount+" 행 update");
		rowCount=stmt.executeUpdate(deleteSql);
		System.out.println(rowCount+" 행 delete");
		
		
		
		
		System.out.println("----------------stme.execute()----------------");
		String anySql = selectSql;
	
		boolean isResultSet = stmt.execute(anySql);
		
		if(isResultSet) {
			System.out.println("sql:" + anySql);
			//ResultSet
			ResultSet rs1 = stmt.getResultSet();
			while(rs1.next()) {
				System.out.println(rs1.getInt("empno")+"\t"+
									rs1.getString("ename")+"\t"+
									rs1.getString("job")+"\t\t"+
									rs1.getDouble("sal")+"\t\t"+
									rs1.getDate("hiredate"));
			}
		}else {
			System.out.println("sql:" + anySql);
			//update count
			int rowCounts = stmt.getUpdateCount();
			System.out.println("update count: " + rowCounts);
		}
		
		stmt.close();
		con.close();
	 	/*
		stmt.executeQuery();
		stmt.executeUpdate();
		stmt.execute();
		*/
		
	}

}
