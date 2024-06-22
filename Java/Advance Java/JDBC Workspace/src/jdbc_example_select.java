import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class jdbc_example_select {
	public  static void main(String args[]) 
	{		
		String dbURL="jdbc:mysql://localhost:3306/sampledb";
		String username="root";
		String password="315121";
		
		try(Connection con=DriverManager.getConnection(dbURL,username,password)) 
		{
			// write queries here for data 	
			String sql="select * from Users";
			Statement statement=con.createStatement();
			ResultSet result=statement.executeQuery(sql);
			
			int count=0;
			while(result.next()) {
				String name=result.getString(2);
				String pass=result.getString(3);
				
				String fullname=result.getString("fullname"); 
				String email= result.getString("email");
				
				String output="User #%d: - %s - %s - %s - %s";
				System.out.println(String.format(output, ++count,name,pass,fullname,email));
			}			
			
			if(con!=null) 
			{
				System.out.println("Connected...");
			}			
		}
		catch(SQLException ex) 
		{
			ex.printStackTrace();				
		}
		
		
		// Step 1 Register driver 
		//Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Step 2 establish the connection
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","315121");
		//System.out.println("Connection Sucessfull");
	}


}
