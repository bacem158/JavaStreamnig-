
public class Photo extends Media implements CheckStatus {
	private float res;
	private int iso;
	public Photo(int mediaID, String title, int userId, float res, int iso) {
		super(mediaID, title, userId);
		this.res=res;
		this.iso=iso;
	}
	public float getRes() {
		return res;
	}
	public void setRes(float res) {
		this.res = res;
	}
	public int getIso() {
		return iso;
	}
	public void setIso(int iso) {
		this.iso = iso;
	}
	
	public boolean isPosted() {
		return true;
	}
	
	public boolean isDeleted() {
		return false;
	}
	@Override
	public String toString() {
		return "Photo [res=" + res + ", iso=" + iso + ", isPosted()=" + isPosted() + ", isDeleted()=" + isDeleted()
				+ ", getMediaID()=" + getMediaID() + ", getTitle()=" + getTitle() + ", getUserId()=" + getUserId()
				+ "]";
	}

	
	
}
