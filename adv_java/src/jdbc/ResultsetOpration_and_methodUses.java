package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetOpration_and_methodUses {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
		String query="select empno,deptno,ename,comm from emp";
		ResultSet rs=st.executeQuery(query);
		
		System.out.println("Moving cursor to the last...");
	      rs.last();
	      
	      System.out.println("retrive the record............\n");
			int empno=rs.getInt("empno");
			int deptno=rs.getInt("deptno");
			String  ename=rs.getString("ename");
			Double comm=rs.getDouble("comm");
			System.out.println(".............display the record................\n");
			System.out.print("empno	:"+empno);
			System.out.print(",	deptno	:"+deptno);
			System.out.print(",	empname	:"+ename);
			System.out.print(",	comm	:"+comm);
			System.out.println();
		
	//retrive the coloumn
	System.out.println("Moving cursor to the first...\n");
    rs.first();
    System.out.println("retrive the record............\n");
		empno=rs.getInt("empno");
		 deptno=rs.getInt("deptno");
		  ename=rs.getString("ename");
		 comm=rs.getDouble("comm");
		 
		System.out.println(".............display the record................\n");
		
		System.out.print("empno	:"+empno);
		System.out.print(",	deptno	:"+deptno);
		System.out.print(",	empname	:"+ename);
		System.out.print(",	comm	:"+comm);
		System.out.println();
		
	System.out.println("........................................Moving cursor to the next row..............................\n");
    rs.next();
    System.out.println("........................................retrive the record..........................................\n");
		empno=rs.getInt("empno");
		 deptno=rs.getInt("deptno");
		  ename=rs.getString("ename");
		 comm=rs.getDouble("comm");
		 
		System.out.println("....................................display the record..........................................\n");
		
		System.out.print("empno	:"+empno);
		System.out.print(",	deptno	:"+deptno);
		System.out.print(",	empname	:"+ename);
		System.out.print(",	comm	:"+comm);
		System.out.println();
			
	System.out.println("........................................Moving cursor to the row 5 ..............................\n");
    rs.relative(5);
    System.out.println("........................................retrive the record..........................................\n");
		empno=rs.getInt("empno");
		 deptno=rs.getInt("deptno");
		  ename=rs.getString("ename");
		 comm=rs.getDouble("comm");
		 
		System.out.println("....................................display the record..........................................\n");
		
		System.out.print("empno	:"+empno);
		System.out.print(",	deptno	:"+deptno);
		System.out.print(",	empname	:"+ename);
		System.out.print(",	comm	:"+comm);
		System.out.println();
				
	System.out.println("........................................Moving cursor to the next row..............................\n");
    rs.next();
    System.out.println("........................................retrive the record..........................................\n");
		empno=rs.getInt("empno");
		 deptno=rs.getInt("deptno");
		  ename=rs.getString("ename");
		 comm=rs.getDouble("comm");
		 
		System.out.println("....................................display the record..........................................\n");
		
		System.out.print("empno	:"+empno);
		System.out.print(",	deptno	:"+deptno);
		System.out.print(",	empname	:"+ename);
		System.out.print(",	comm	:"+comm);
		System.out.println();
				
				/*System.out.println("........................................Moving cursor to the before first row..............................\n");
			    rs.beforeFirst();
			    System.out.println("........................................retrive the record..........................................\n");
					empno=rs.getInt("empno");
					 deptno=rs.getInt("deptno");
					  ename=rs.getString("ename");
					 comm=rs.getDouble("comm");
					 
					System.out.println("....................................display the record..........................................\n");
					
					System.out.print("empno	:"+empno);
					System.out.print(",	deptno	:"+deptno);
					System.out.print(",	empname	:"+ename);
					System.out.print(",	comm	:"+comm);
					System.out.println();*/
					
	System.out.println("........................................Moving cursor to the row 5 ..............................\n");
    rs.absolute(5);
    System.out.println("........................................retrive the record..........................................\n");
		empno=rs.getInt("empno");
		 deptno=rs.getInt("deptno");
		  ename=rs.getString("ename");
		 comm=rs.getDouble("comm");
		 
		System.out.println("....................................display the record..........................................\n");
		
		System.out.print("empno	:"+empno);
		System.out.print(",	deptno	:"+deptno);
		System.out.print(",	empname	:"+ename);
		System.out.print(",	comm	:"+comm);
		System.out.println();
		System.out.println("........................................Moving cursor to the next row..............................\n");
	    rs.next();
	    System.out.println("........................................retrive the record..........................................\n");
			empno=rs.getInt("empno");
			 deptno=rs.getInt("deptno");
			  ename=rs.getString("ename");
			 comm=rs.getDouble("comm");
			 
			System.out.println("....................................display the record..........................................\n");
			
			System.out.print("empno	:"+empno);
			System.out.print(",	deptno	:"+deptno);
			System.out.print(",	empname	:"+ename);
			System.out.print(",	comm	:"+comm);
			System.out.println();
						
	System.out.println("........................................find the  coloumn no of ename..............................\n");
   // rs.findColumn("ename");
    System.out.println("........................................retrive the record..........................................\n");
		/*empno=rs.getInt("empno");
		 deptno=rs.getInt("deptno");*/
		 int  s=rs.findColumn("ename");
		 comm=rs.getDouble("comm");
		 
		System.out.println("....................................display the record..........................................\n");
		
		System.out.print("empno	:"+empno);
		System.out.print(",	deptno	:"+deptno);
		System.out.print(".................."+s);
		System.out.print(",	comm	:"+comm);
		System.out.println();
							

							/*System.out.println("........................................Moving cursor to the coloumn ename..............................\n");
						    rs.getRowId(5);
						    System.out.println("........................................retrive the record..........................................\n");
								empno=rs.getInt("empno");
								 deptno=rs.getInt("deptno");
								  ename=rs.getString("ename");
								 comm=rs.getDouble("comm");
								 
								System.out.println("....................................display the record..........................................\n");
								
								System.out.print("empno	:"+empno);
								System.out.print(",	deptno	:"+deptno);
								System.out.print(",	empname	:"+ename);
								System.out.print(",	comm	:"+comm);
								System.out.println();*/
								
			rs.close();
			st.close();
			con.close();
	
}
	

}
