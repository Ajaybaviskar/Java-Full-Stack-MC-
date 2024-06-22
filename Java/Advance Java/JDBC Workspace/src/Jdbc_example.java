import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Jdbc_example {
	public  static void main(String args[]) 
	{		
		String dbURL="jdbc:mysql://localhost:3306/sampledb";
		String username="root";
		String password="315121";
		
		try(Connection con=DriverManager.getConnection(dbURL,username,password)) 
		{
			// write queries here for inserting data 	
			String sql="INSERT INTO users(username,password,fullname,email) VALUES(?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1, "Raviraj");
			statement.setString(2, "1234565");
			statement.setString(3, "raviraj patil");
			statement.setString(4, "raviraj@123");
			
			int rowInserted=statement.executeUpdate();
			if(rowInserted>0) {
				System.out.println("A New User was Inserted Successfully ! ");
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
