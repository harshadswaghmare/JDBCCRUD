package Model;

public class Student {

	private int LoginID;
	private String password;
	private String username;
	private String email;
	public Student(int loginID, String password, String username, String email) {
		super();
		LoginID = loginID;
		this.password = password;
		this.username = username;
		this.email = email;
	}
	public Student(String password, String username, String email) {
		super();
		this.password = password;
		this.username = username;
		this.email = email;
	}
	public Student() {
		super();
	}
	public int getLoginID() {
		return LoginID;
	}
	public void setLoginID(int loginID) {
		LoginID = loginID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 public String toString() {
	        return "StudentLogin [LoginID=" + LoginID + ", password=" + password + ", userName=" + username + " Email=" + email + "]";
	    }
	
	
}
