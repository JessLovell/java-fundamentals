public class Review {
    private String body;
    private String author;
    private int reviewStars;
    protected Object parentObject;

    public Review (String body, String author, int reviewStars){
        this.body = body;
        this.author = author;
        this.reviewStars = reviewStars;
        this.parentObject = null;
    }

    public String toString() {
        return this.author + " rated "+ this.parentObject +" with " + this.reviewStars + " stars\n Review: '" + this.body + "'";
    }

    public int getStars(){
        return this.reviewStars;
    }
}
