// Menu Driven Program with CRUD operation

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class menu_CRUD {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome for CURD Operation please press 1 for continue..");
		System.out.println("Press 1 for Inserting Data");
		System.out.println("Press 2 for Show Data");
		System.out.println("Press 3 For Updating Data");
		System.out.print("Press 4 For Delete Data --> ");
		int first_op= sc.nextInt();
		
		
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "315121";
		
		
		try (Connection con = DriverManager.getConnection(dbURL, username, password))
		{
			
			switch(first_op) {
			  case 1:
//				First Case for Inserting data into database
			    String sql="insert into users1 (first_name,last_name,mobile_no,age) values (?,?,?,?)";
			    PreparedStatement statement=con.prepareStatement(sql);
			    
			    System.out.print("Enter First Name --> ");
			    String first_name=sc.next();
			    System.out.print("Enter Last Name --> ");
			    String last_name=sc.next();
			    System.out.print("Enter Mobile Number --> ");
			    String mobile_no=sc.next();
			    System.out.print("Enter Age --> "); 
			    int age=sc.nextInt();
			    
//			    System.out.println(first_name);
//			    System.out.println(last_name);
//			    System.out.println(mobile_no);
//			    System.out.println(age);
			    
			    statement.setString(1,first_name);
			    statement.setString(2,last_name);
			    statement.setString(3,mobile_no);
			    statement.setInt(4,age);
			    
			    int rowsInserted=statement.executeUpdate();
			    if(rowsInserted>0) {
			    	System.out.println("A new user was inserted Successfully !");
			    }			    
			    break;
			    
			    
//			  Second Case for iterating Data in Database  
			  case 2:
			    System.out.println("Reading Data ");
			    String sql1="select * from users1";
			    Statement statement1=con.createStatement();
			    ResultSet result=statement1.executeQuery(sql1);
			    
			    int count=0; 
			    while(result.next()) 
			    {
			    	String first_name1=result.getString(2);
			    	String last_name1=result.getString(3);
			    	String mobile_no1=result.getString(4);
			    	String age1=result.getString(5);
			    	
			    	String output = "User #%d: %s - %s - %s - %s";
			    	System.out.println(String.format(output, ++count, first_name1, last_name1, mobile_no1, age1));
			    	
			    	
			    	
			    }
			    break;
			    
//			  Case 3 Updating Data 
			  case 3:
				    int id=0;
				    int rowsUpdated;
				    System.out.println("Press 1 For Update First Name");
				    System.out.println("Press 2 For Update Last Name");
				    System.out.println("Press 3 For Update Mobile Number");
				    System.out.println("Press 4 For Update Age --> ");
					int second_op= sc.nextInt();
					
					switch(second_op) {
					  case 1:
						  //update First Name Here 						  
						  System.out.print("Enter First Name For Update --> ");		
						  String update_name=sc.next();
						  System.out.println("Enter Id  For Reference -->");
						  id=sc.nextInt();
						  
						  String sql_update_fname="update users1 set first_name=? where user_id=?";						  
						  PreparedStatement statement2=con.prepareStatement(sql_update_fname);
						  statement2.setString(1, update_name);
						  statement2.setInt(2, id);		
						  
						  rowsUpdated=statement2.executeUpdate();
						  if(rowsUpdated>0) {
							  System.out.println("First is Update Sucessfull");
						  }
						  
					    break;
					  case 2:
						  
						  // Update Last Name Here
						  System.out.println("Enter Last Name For Update --> ");
						  String update_lname=sc.next();
						  System.out.println("Enter Id For Reference --> ");
						  id=sc.nextInt();
						  
						  String sql_update_lname="update users1 set last_name=? where user_id=?";
						  PreparedStatement statement3=con.prepareStatement(sql_update_lname);
						  statement3.setString(1, update_lname);
						  statement3.setInt(2, id);
						  
						  rowsUpdated=statement3.executeUpdate();
						  if(rowsUpdated>0) {
							  System.out.println("Last Name Update Successfull");
						  }
						  break;					  
						  
					  case 3:
						    // Update Mobile Number Here
						  System.out.println("Enter Mobile Number For Update --> ");
						  int updated_mno=sc.nextInt();
						  System.out.println("Enter Id For Reference --> ");
						  id=sc.nextInt();
						  
						  String sql_update_mno="update users1 set mobile_no=? where user_id=?";
						  PreparedStatement statement4=con.prepareStatement(sql_update_mno);
						  statement4.setInt(1, updated_mno);
						  statement4.setInt(2, id);
						  
						  rowsUpdated=statement4.executeUpdate();
						  if(rowsUpdated>0) {
							  System.out.println("Mobile Number is Update Successfull");
							  
						  }
						  break;  						  
						    
					  case 4:
						  //  Update Age Here 
						  System.out.println("Enter Age For Update -->");
						  int updated_age=sc.nextInt();
						  System.out.println("Enter Id For Reference --> ");
						  id=sc.nextInt();
						  
						  String sql_update_age="update users1 set age=? where user_id=?";
						  PreparedStatement statement5=con.prepareStatement(sql_update_age);
						  statement5.setInt(1, updated_age);
						  statement5.setInt(2, id); 
						  
						  rowsUpdated=statement5.executeUpdate();
						  if(rowsUpdated>0) {
							  System.out.println("Age is Updated Successfull");
						  }						  
						  
					    break;
					  default:
					    System.out.println("Please Choose Correct Option");
					}					
				    
//			  Deleting Data from data base   
			  case 4:
				    System.out.println("Enter id for Delete Data From Database --> ");
				    id=sc.nextInt();
				    String sql_delete="delete from users1 where user_id=?";
				    PreparedStatement statement6=con.prepareStatement(sql_delete);
				    statement6.setInt(1, id);
				    
				    rowsUpdated=statement6.executeUpdate();
				    if(rowsUpdated>0) {
				    	System.out.println(id+" : Is Delelted From DataBase");
				    }
			    
			    break;
			  default:
			    System.out.println("Please Enter Correct Choose");
			}		
			
			if(con!=null) {
				System.out.println("connected"); 
			}			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}		
	}
}
