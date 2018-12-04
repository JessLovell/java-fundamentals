public class Review {
    private String body;
    private String author;
    private int reviewStars;

    public Review (String body, String author, int reviewStars){
        this.body = body;
        this.author = author;
        this.reviewStars = reviewStars;
    }

    public String toString() {
        return this.author + " rated this restaurant with " + this.reviewStars + " stars\n Review: '" + this.body + "'";
    }

    public int getStars(){
        return this.reviewStars;
    }

}
