package Repository;


import java.sql.Connection;
import java.sql.PreparedStatement;



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
	

}
