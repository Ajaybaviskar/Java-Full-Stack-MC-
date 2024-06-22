import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc_example_update {
	public static void main(String args[]) {
		String dbURL="jdbc:mysql://localhost:3306/sampledb";
		String username="root";
		String password="315121";
		
		try 
		{
			Connection con=DriverManager.getConnection(dbURL,username,password);
			if(con!=null) {
				System.out.println("Connected");
			}
			
			
			// write queries here for update
			String sql="update users set password=? where user_id=?";
//			String sql ="update user set password=?, fullname=?,email=?,where username=?";
			
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setString(1,"@dmin123");
			statement.setInt(2, 1);
			
			int rowsUpdated=statement.executeUpdate();
			
			if(rowsUpdated>0) {
				System.out.println("updated sucessfully !");				
				
			}			
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			
		}
	}

}
