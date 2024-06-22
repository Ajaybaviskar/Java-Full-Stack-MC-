import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc_example_delete {
	public static void main(String args[]) {
		String dbURL="jdbc:mysql://localhost:3306/sampledb";
		String username="root";
		String password="315121"; 
		
		try(Connection con=DriverManager.getConnection(dbURL,username,password))				
		{
			
			// write queries for delete 
			String sql="delete from users where user_id=?";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1,2);
			
			int rowsDeleted=statement.executeUpdate();
			if(rowsDeleted>0) {
				System.out.println("A user was deleted successfully !");
			}
			
			
			
			
			if(con!=null) {
				System.out.println("Connected...");
			}			
		}
		catch(SQLException ex){
			ex.printStackTrace();
			
		}
	}

}
