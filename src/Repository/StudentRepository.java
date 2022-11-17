package Repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Model.Student;
import Resources.Applicatinproperty;
public class StudentRepository {
	
	public static boolean insert(Student student)
	{
		boolean flag = false;
	
		try {
			Connection connection = Applicatinproperty.CreateConn();
			String query = "insert into StudentLogin(password,username,email)values(?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, student.getPassword());
			preparedStatement.setString(2, student.getUsername());
			preparedStatement.setString(3, student.getEmail());
			preparedStatement.executeUpdate();			
			flag = true;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	public static void display()
	{
		try {
			Connection connection = Applicatinproperty.CreateConn();
			Statement stmt = connection.createStatement();
			String sql = "select * from StudentLogin ";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int LoginID = rs.getInt("LoginID");
				String password = rs.getString("password");
				String username = rs.getString("username");
				String email = rs.getString("email");

				System.out.print("ID: " + LoginID);
				System.out.print(", password: " + password);
				System.out.print(", username: " + username);
				System.out.println(" email : " + email);
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
