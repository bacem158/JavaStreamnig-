
public class Video extends Media implements CheckStatus {
	private int length;
	private String format;
	public Video(int mediaID, String title, int userId, int length, String format) {
		super(mediaID, title, userId);
		this.length=length;
		this.format=format;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	 
	public boolean isPosted() {
		return false;
	}
	
	public boolean isDeleted() {
		return true;
	}

	@Override
	public String toString() {
		return "Video [length=" + length + ", format=" + format + ", isPosted()=" + isPosted() + ", isDeleted()="
				+ isDeleted() + ", getMediaID()=" + getMediaID() + ", getTitle()=" + getTitle() + ", getUserId()="
				+ getUserId() + "]";
	}
	
}
