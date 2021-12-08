
public class Admin extends User{
	private int adminKey;
	public Admin(String userName, String email, boolean isAdmin, int adminKey) {
		super(userName, email, isAdmin);
		this.adminKey=adminKey;
	}
	public int getAdminKey() {
		return adminKey;
	}
	public void setAdminKey(int adminKey) {
		this.adminKey = adminKey;
	}
	
	public void uploadPhoto() {
		
	}
	public void uploadVideo() {
		
	}
	public void linkPhoto() {
		
	}
	public void linkVideo() {
		
	}
	public void deletePhoto() {
		
	}
	public void deleteVideo() {
		
	}
	@Override
	public String toString() {
		return "Admin [adminKey=" + adminKey + ", getAdminKey()=" + getAdminKey() + ", getUserName()=" + getUserName()
				+ ", getEmail()=" + getEmail() + ", isAdmin()=" + isAdmin() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
