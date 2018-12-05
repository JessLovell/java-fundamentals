import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Shop {
    protected String name;
    protected String description;
    protected String price;
    protected List<Review> reviews;

    public Shop(String name, String description, String price) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = null;
    }

    //This method will print the details of the shop: name, description, and average price
    @Override
    public String toString() {

        return this.name + " has a price rating of : " + this.price + "\nAbout: " + this.description;
    }

    //This method will add a review to the reviews list for a shop
    public void addReview(Review newReview) {

        //check if the list is empty
        if (this.reviews == null) {
            List<Review> reviewList = new LinkedList<>();
            reviewList.add(newReview);
            this.reviews = reviewList;
        } else {
            this.reviews.add(newReview);
        }
        newReview.parentObject = this; //tie the review to this instance of shop
    }
}
