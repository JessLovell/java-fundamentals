public class Review {
    private String body;
    private String author;
    private int reviewStars;
    protected Object business;
    protected String tag;

    public Review (String body, String author, int reviewStars){
        this.body = body;
        this.author = author;
        this.reviewStars = reviewStars;
        this.business = null;
        this.tag = null;
    }

    public String toString() {
        if (this.tag != null) {
            return this.author + " rated " + this.tag + " with " + this.reviewStars + " stars\n Review: '" + this.body + "'";
        }
        return this.author + " rated this with " + this.reviewStars + " stars\n Review: '" + this.body + "'";
    }

    public int getStars(){
        return this.reviewStars;
    }
}
