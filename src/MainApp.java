
public class MainApp {

	public static void main(String[] args) {
		Photo photo1 = new Photo(1, "photo1", 12, 15, 17);
		Video video1 = new Video(1, "video1", 15, 120, "mp4");
		User user1 = new User("Maes", "LDS.MAES@gmail.com", false);
		Admin admin1 = new Admin("Maars","LDS.MAARSS@gmail.com" , true, 93270);
		
		System.out.println(photo1);
		System.out.println(video1);
		System.out.println(user1);
		System.out.println(admin1);
	}

}
