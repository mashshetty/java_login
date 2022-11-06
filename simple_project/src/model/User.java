package model;

public class User {
	
private	String username;
private String email;
private String password;
private String confirmpass;
	
	public User(String uname,String email, String password, String cpass){
		this.username = uname;
		this.email= email;
		this.password = password;
		this.confirmpass = cpass;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpass() {
		return confirmpass;
	}

	public void setConfirmpass(String confirmpass) {
		this.confirmpass = confirmpass;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", password=" + password + ", confirmpass="
				+ confirmpass + "]";
	}
	
	

}
