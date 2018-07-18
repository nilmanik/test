package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchWithPreparedStatement {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn= null;
		   //Statement stmt = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		 //stmt=conn.createStatement();
		
	     
	     String SQL = "INSERT INTO emp (empno, ename, job, mgr) VALUES (?,?,?,?);";
	  // Create PrepareStatement object
	     PreparedStatement stmt = conn.prepareStatement(SQL);

	     //Set auto-commit to false
	     conn.setAutoCommit(false);

	     // Set the variables
	     stmt.setInt( 1, 4001 );
	     stmt.setString( 2, "Pappu" );
	     stmt.setString( 3, "Singh" );
	     stmt.setInt( 4, 3000 );
	     // Add it to the batch
	     stmt.addBatch();

	     // Set the variables
	     stmt.setInt( 1, 4002 );
	     stmt.setString( 2, "Pawan" );
	     stmt.setString( 3, "Singh" );
	     stmt.setInt( 4, 3001 );
	     // Add it to the batch
	     stmt.addBatch();

	    
	     //Create an int[] to hold returned values
	     int[] count = stmt.executeBatch();

	     //Explicitly commit statements to apply changes
	     conn.commit();
	     // Create an int[] to hold returned values
	     

	     //Explicitly commit statements to apply changes
	     conn.commit();

	     // Again, let us select all the records and display them.
	     printRows( stmt );

	     // Clean-up environment
	     stmt.close();
	     conn.close();
		
	}
	public static void printRows(Statement stmt) throws SQLException{
		   System.out.println("Displaying available rows...");
		   // Let us select all the records and display them.
		   String SQL = "SELECT empno, ename, job, mgr FROM emp";
		   ResultSet rs = stmt.executeQuery(SQL);

		   while(rs.next()){
		      //Retrieve by column name
		      int empno  = rs.getInt("empno");
		      int mgr = rs.getInt("mgr");
		      String ename = rs.getString("ename");
		      String job = rs.getString("job");

		      //Display values
		      System.out.print("empno   : " + empno);
		      System.out.print(", mgr   : " + mgr);
		      System.out.print(", ename  : " + ename);
		      System.out.println(", job  : " + job);
		   }
		   System.out.println();
		   rs.close();
		}//end printRows()
}
		
		
		
		
		
		
		
		// JDBC driver name and database URL
		  /* static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";

		   //  Database credentials
		   static final String USER = "scott";
		   static final String PASS = "tiger";
		   
		   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      // Register JDBC driver
			   Class.forName("oracle.jdbc.driver.OracleDriver");

		      // Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);

		      // Create statement
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      // Set auto-commit to false
		      conn.setAutoCommit(false);

		      // First, let us select all the records and display them.
		      printRows( stmt );
		  
		      // Create SQL statement
		      String SQL = "INSERT INTO emp (empno, ename, job, mgr) VALUES (1111,'Zia', 'peon', 3000);";
		      // Add above SQL statement in the batch.
		      stmt.addBatch(SQL);

		      // Create one more SQL statement
		      SQL = "INSERT INTO emp (empno, ename, job, mgr) VALUES (1112,'navya', 'parlour', 3001);";
		      // Add above SQL statement in the batch.
		      stmt.addBatch(SQL);

		      // Create one more SQL statement
		      SQL = "UPDATE emp SET comm = 700 WHERE enmae = 'FORD'";
		      // Add above SQL statement in the batch.
		      stmt.addBatch(SQL);

		      // Create an int[] to hold returned values
		      int[] count=stmt.executeBatch()

		      //Explicitly commit statements to apply changes
		      conn.commit();

		      // Again, let us select all the records and display them.
		      printRows( stmt );

		      // Clean-up environment
		      stmt.close();
		      conn.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		}//end main

		public static void printRows(Statement stmt) throws SQLException{
		   System.out.println("Displaying available rows...");
		   // Let us select all the records and display them.
		   String sql = "SELECT empno, ename, job, mgr FROM emp";
		   ResultSet rs = stmt.executeQuery(sql);

		   while(rs.next()){
		      //Retrieve by column name
		      int empno  = rs.getInt("empno");
		      int mgr = rs.getInt("mgr");
		      String ename = rs.getString("ename");
		      String job = rs.getString("job");

		      //Display values
		      System.out.print("empno   : " + empno);
		      System.out.print(", mgr   : " + mgr);
		      System.out.print(", ename  : " + ename);
		      System.out.println(", job  : " + job);
		   }
		   System.out.println();
		   rs.close();
		}//end printRows()
		}//end JDBCExample
*/

