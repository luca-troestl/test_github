package news;

import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class Post {

	private String author;
	private int likes;
	private ArrayList<String> comment;
	private LocalDateTime time;
	private String hashtag;
	
	
	
	public Post(String author) {
		super();
		this.author = author;
		this.likes = 0;
		this.comment = new ArrayList<String>();
		this.time = LocalDateTime.now();
		this.hashtag = hashtag;
	}
	
	public String getHashtag() {
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public ArrayList<String> getComment() {
		return comment;
	}
	public void setComment(ArrayList<String> comment) {
		this.comment = comment;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	
	
	
}
