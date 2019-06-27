import java.util.LinkedList;
import java.util.List;

public abstract class Business {

    private String name;
    private String location;
    private List<Review> reviews;
    private String description;
    private int rating;

    public Business(){
        this.name = "Unknown Business";
        this.location = "Undisclosed location";
        this.reviews = new LinkedList<>();
        this.description = "No description";
        this.rating = 0;
    }

    public Business(Business business){
        this.name = name;
        this.location = location;
        this.reviews = reviews;
        this.description = description;
        this.rating = rating;
        updateRating();
    }

    public Business(String name){
        this.name = name;
        this.location = location;
        this.reviews = new LinkedList<>();
        this.description = description;
        this.rating = 0;
    }

    public Business(String name, String location, String description){
        this.name = name;
        this.location = location;
        this.reviews = new LinkedList<>();
        this.description = description;
        this.rating = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getLocation(){
        return this.location;
    }

    public String getDescription(){
        return this.description;
    }
     public List<Review> getReviews(){
        return this.reviews;
     }

     public int getRating(){
        return this.rating;
     }

     public boolean addReview(Review review){
        this.reviews.add(review);
         updateRating();
         return true;
     }

     public Review addReview(String body, String author, int reviewStars){
        Review newReview = new Review(body, author, reviewStars);
        this.reviews.add(newReview);
        updateRating();
        return newReview;
     }

     private void updateRating(){
         int total = 0;
         for (Review r : this.reviews){
             total += r.getStars();
         }
        this.rating = total/reviews.size();
    }

    public String toString(){
       return "Business Name: " + this.name +
                "\nLocation: " + this.location +
                "\nDescription: " + this.description +
                "\nRating: " + this.rating + " out of 5 stars" +
                "\nfrom " + reviews.size() + " reviews";
    }

}
