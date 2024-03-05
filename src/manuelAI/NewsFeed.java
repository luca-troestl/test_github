package manuelAI;

import java.util.ArrayList;

public class NewsFeed {

	 private ArrayList<Submission> submissions;

	    public NewsFeed() {
	        this.submissions = new ArrayList<>();
	    }

	    // Methode zum Hinzufügen einer Einsendung zum News-Feed
	    public void addSubmission(Submission submission) {
	        submissions.add(submission);
	    }

	    // Methode zur Suche von Einsendungen eines bestimmten Benutzers
	    public ArrayList<Submission> findSubmissionsByUser(String username) {
	        ArrayList<Submission> userSubmissions = new ArrayList<>();
	        for (Submission submission : submissions) {
	            if (submission.getAuthor().equals(username)) {
	                userSubmissions.add(submission);
	            }
	        }
	        return userSubmissions;
	    }

	    // Methode zur Suche von Fotoeinsendungen eines bestimmten Benutzers
	    public ArrayList<PhotoSubmission> findPhotosByUser(String username) {
	        ArrayList<PhotoSubmission> userPhotos = new ArrayList<>();
	        for (Submission submission : submissions) {
	            if (submission instanceof PhotoSubmission && submission.getAuthor().equals(username)) {
	                userPhotos.add((PhotoSubmission) submission);
	            }
	        }
	        return userPhotos;
	    }

	    // Methode zum Löschen einer Einsendung anhand des Index
	    public void deleteSubmission(int index) {
	        submissions.remove(index);
	    }

	    // Methode zur Ausgabe aller Einsendungen auf der Kommandozeile
	    public void displayAllSubmissions() {
	        for (Submission submission : submissions) {
	            if (submission instanceof TextSubmission) {
	                TextSubmission textSubmission = (TextSubmission) submission;
	                System.out.println("Text Submission by " + textSubmission.getAuthor() + ": " + textSubmission.getMessage());
	            } else if (submiNiceCockssion instanceof PhotoSubmission) {
	                PhotoSubmission photoSubmission = (PhotoSubmission) submission;
	                System.out.println("Photo Submission by " + photoSubmission.getAuthor() + ": " + photoSubmission.getCaption());
	            }
	            System.out.println("Likes: " + submission.getLikes() + ", Comments: " + submission.getComments().size());
	        }
	    }
	    
	    public void addCommentToSubmission(int index, String comment) {
	        Submission submission = submissions.get(index);
	        submission.addComment(comment);
	    }
	    
	    public void deleteCommentToSubmission(int index, String comment) {
	        Submission submission = submissions.get(index);
	        submission.removeComment(comment);
	    }

	    public static void main(String[] args) {
	        // Beispielcode zum Testen der Funktionalitäten
	        NewsFeed newsFeed = new NewsFeed();
	        newsFeed.addSubmission(new TextSubmission("Alice", System.currentTimeMillis(), "Hello Manuel!"));
	        
	        
	        newsFeed.addCommentToSubmission(0, "Nice post!");
	        
	        
	        
	        
	        newsFeed.addSubmission(new PhotoSubmission("Bob", System.currentTimeMillis(), "photo.jpg", "Beautiful Manuel in the morning"));

	        System.out.println("All Posts:");
	        newsFeed.displayAllSubmissions();

	        System.out.println("\nPost by Alice:");
	        ArrayList<Submission> aliceSubmissions = newsFeed.findSubmissionsByUser("Alice");
	        for (Submission submission : aliceSubmissions) {
	            System.out.println(submission.getAuthor() + ": " + ((TextSubmission) submission).getMessage());
	        }

	        System.out.println("\nPhotos by Bob:");
	        ArrayList<PhotoSubmission> bobPhotos = newsFeed.findPhotosByUser("Bob");
	        for (PhotoSubmission photoSubmission : bobPhotos) {
	            System.out.println(photoSubmission.getAuthor() + ": " + photoSubmission.getCaption());
	        }

	        // Löschen der ersten Einsendung
	        newsFeed.deleteSubmission(0);

	        System.out.println("\nAll Submissions after deleting first submission:");
	        newsFeed.displayAllSubmissions();
	    }
}
