package news;

public class PictureMessage extends Post {

	private String headline;
	private String picture;
	
	public PictureMessage(String author, String headline, String picture) {
		super(author);
		this.headline = headline;
		this.picture = picture;
	}
	
	
}
