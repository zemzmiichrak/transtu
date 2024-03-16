package transtu.pfe.Request;

public class LoginRequest {
	   private String Email;
	   private String Password;
	public LoginRequest(String email, String password) {
		super();
		Email = email;
		Password = password;
	}
	public LoginRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "LoginRequest [Email=" + Email + ", Password=" + Password + "]";
	}
	   
}
