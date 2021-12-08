
public class User implements Operations{
	private String userName;
	private String email;
	private boolean isAdmin;
	
	public User(String userName, String email, boolean isAdmin) {
		this.userName = userName;
		this.email = email;
		this.isAdmin = isAdmin;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", isAdmin=" + isAdmin + ", getUserName()="
				+ getUserName() + ", getEmail()=" + getEmail() + ", isAdmin()=" + isAdmin() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
