package Databases_Praveen_tut;
import java.sql.*;
public class DBActions {
Connection con;
Statement s;
String userName = "root";
String password = "testing";
String url = "jdbc:mysql://localhost/test";

	public static void main (String args[])
	{
		int n;
		DBActions db= new DBActions();
		//n=db.jdbcUpdate("Insert into student value (5, 'babu', 'b@g.com')");
		//System.out.println("System updated"+n+" no of records");
		db.jdbcQuery("Select * from student");
	}
	
	int jdbcUpdate(String q)
	{
		try {
		int records;
		Class.forName ("com.mysql.jdbc.Driver").newInstance ();
        con = DriverManager.getConnection (url, userName, password);
        s= con.createStatement();
        records=s.executeUpdate(q);		
		s.close();
		con.close();
		return(records);
		}
		catch (Exception e)
		{
System.out.println("Some error in connecting to db");
e.printStackTrace();

		}
		return(0);

	}
	
	ResultSet jdbcQuery(String q)
	{
		ResultSet rs= null;
		try {
			Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	        con = DriverManager.getConnection (url, userName, password);
	        s= con.createStatement();
	         rs = s.executeQuery (q);
           // ResultSet rs = s.getResultSet ();
            while (rs.next ())
            {
                int idVal = rs.getInt ("id");
                String nameVal = rs.getString ("name");
               String catVal = rs.getString ("email");
                //String catVal = rs.;
                System.out.println (
                        "id = " + idVal
                        + ", name = " + nameVal
                        + ", email = " + catVal);
            }
           // rs.close ();
            s.close ();
			con.close();
			return(rs);
		}
		catch(Exception e)
		{
			
		}
		return(rs);
	}
}
