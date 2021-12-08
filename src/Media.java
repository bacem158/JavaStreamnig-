
abstract class Media {
	private int mediaID;
	private String title;
	private int userId;
	
	public Media(int mediaID, String title, int userId) {
		super();
		this.mediaID = mediaID;
		this.title = title;
		this.userId = userId;
	}

	public int getMediaID() {
		return mediaID;
	}

	public void setMediaID(int mediaID) {
		this.mediaID = mediaID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	static void Media() {
		 
	}

}
