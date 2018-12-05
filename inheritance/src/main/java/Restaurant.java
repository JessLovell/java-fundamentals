import java.util.LinkedList;
import java.util.List;

/*
 *
 */
public class Restaurant {

    protected String name;
    protected int stars;
    protected String price;
    protected List<Review> reviews;

    public Restaurant (String name, String price) {
        this.name = name;
        this.stars = 0;
        this.price = price;
        this.reviews = null;
    }

    // Method toString outputs the name, rating, and price of a restaurant
    @Override
    public String toString(){
        return this.name + " is rated " + this.stars + " and priced at " + this.price;
    }

    //This method creates a new review and adds it to the list of reviews
    public void addReview(Review newReview) {

        //check to see if the list is empty
        if (this.reviews == null) {
            List<Review> reviewsList = new LinkedList<>();
            reviewsList.add(newReview);
            this.reviews = reviewsList;
        } else {
            this.reviews.add(newReview);
        }
        newReview.parentObject = this; //tie review to restaurant
        updateStars();
    }

    //this method updates the star rating for the restaurant
    public void updateStars(){

        int total = 0;
        for (Review review : reviews) {
            total += review.getStars();
        }
        this.stars = total/reviews.size();
    }

    //This method outputs the reviews in the reviews list.
    public void getReviews(){

        System.out.println("Reviews for " + this.name + ":");
        for (Review review : this.reviews) {
           System.out.println(review.toString());
        }
    }
}
