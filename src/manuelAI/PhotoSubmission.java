package manuelAI;

public class PhotoSubmission extends Submission{

	private String photoFilename;
    private String caption;

    public PhotoSubmission(String author, long timestamp, String photoFilename, String caption) {
        super(author, timestamp);
        this.photoFilename = photoFilename;
        this.caption = caption;
    }

    // Getter f�r Dateiname und �berschrift des Fotos
    public String getPhotoFilename() {
        return photoFilename;
    }

    public String getCaption() {
        return caption;
    }
    
}
