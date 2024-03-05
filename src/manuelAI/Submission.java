package manuelAI;

import java.util.ArrayList;
import java.util.List;

public class Submission {

	 private String author;
	    private long timestamp;
	    private int likes;
	    private List<String> comments;

	    public Submission(String author, long timestamp) {
	        this.author = author;
	        this.timestamp = timestamp;
	        this.likes = 0;
	        this.comments = new ArrayList<>();
	    }

	    // Getter und Setter für die Attribute
	    public String getAuthor() {
	        return author;
	    }

	    public long getTimestamp() {
	        return timestamp;
	    }

	    public int getLikes() {
	        return likes;
	    }

	    public void addLike() {
	        likes++;
	    }

	    public List<String> getComments() {
	        return comments;
	    }

	    public void addComment(String comment) {
	        comments.add(comment);
	    }

		public void removeComment(String comment) {
			comments.remove(comment);	
		}
	}
