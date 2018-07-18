package jdbc;
import java.sql.*;
public class JdbcConnection {
/*public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			//step2 create  the connection object
			//here "ocrl" is the global db name/sid name or we can find with the help select * from global_name;
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery(""); 
			//rs.absolute(3);
			
			while(rs.next()) { 
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)); 
			
			//step5 close the connection object  
			}
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
			}  
		}  */

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step-1.load and register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded successfully");
		//step-2.establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		System.out.println("connection established successfully");
		//step-3.create statement and execute statement
		Statement st=con.createStatement();
		//execute statement and check its resultset true or not
		String sql="update emp set comm=500 where deptno=10";
		Boolean b=st.execute(sql);
		System.out.println("result set value is  "+b.toString());
		
		// execute statement and check how many affected row is present
		
		int aff=st.executeUpdate(sql);
		System.out.println("no of impacted row is  "+aff);
		
		//step-4.store the value in resultset and show the table result
		String query="select empno,deptno,ename,comm from emp";
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()){
			int empno=rs.getInt("empno");
			int deptno=rs.getInt("deptno");
			String  ename=rs.getString("ename");
			Double comm=rs.getDouble("comm");
			
			System.out.print("empno	:"+empno);
			System.out.print(",	deptno	:"+deptno);
			System.out.print(",	empname	:"+ename);
			System.out.print(",	comm	:"+comm);
			System.out.println();
		}
		
		//step-5.close the all environment
		rs.close();
		st.close();
		con.close();
		
		
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
