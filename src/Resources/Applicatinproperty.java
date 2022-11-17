package Resources;

import java.sql.Connection;
import java.sql.DriverManager;

public class Applicatinproperty {
	
	static Connection conn;
	public static Connection CreateConn()
	{
	   try {
		   Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/StudentsDB";
		    String user = "postgres";
			String pass = "ConfluxSYS247";
			conn =DriverManager.getConnection(url,user,pass);
			System.out.println("connection established successfully");
	   }catch (Exception e) {
		e.printStackTrace();
	}
	
	
  return conn;
}
}
