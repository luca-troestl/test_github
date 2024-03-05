package manuelAI;

public class TextSubmission extends Submission {

	 private String message;

	    public TextSubmission(String author, long timestamp, String message) {
	        super(author, timestamp);
	        this.message = message;
	    }

	    // Getter für die Nachricht
	    public String getMessage() {
	        return message;
	    }
	    
}
