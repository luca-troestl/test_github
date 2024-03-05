package manuelAI;

public class TextSubmission extends Submission {

	 private String message;

	    public TextSubmission(String author, long timestamp, String message) {
	        super(author, timestamp);
	        this.message = message;
	    }

	    // Getter f�r die Nachricht
	    public String getMessage() {
	        return message;
	    }
	    
}
