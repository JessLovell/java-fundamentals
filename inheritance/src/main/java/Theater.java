import java.util.LinkedList;
import java.util.List;

public class Theater implements thingToReview{

    protected String name;
    protected List<String> nowPlaying;
    protected List<Review> reviews;

    public Theater(String name){
        this.name = name;
        this.nowPlaying = null;
        this.reviews = null;
    }

    //this method prints out the theater instance as a string
    @Override
    public String toString() {
        if (nowPlaying == null) {
            return this.name + " is not playing any movies";
        }
        return this.name + " is playing " + this.nowPlaying;
    }

    //this method adds a reivew to a specific instance of a theater
    @Override
    public void addReview(Review newReview) {

        //check if the list is empty
        if (this.reviews == null) {
            List<Review> movie = new LinkedList<>();
            movie.add(newReview);
            this.reviews = movie;
        } else {
            this.reviews.add(newReview);
        }
        newReview.business = this;
    }

    //this method adds a movie to the nowPlaying list
    public void addMovie(String movie) {

        //check if the list is empty
        if(this.nowPlaying == null) {
            List<String> movieList = new LinkedList<>();
            movieList.add(movie);
            this.nowPlaying = movieList;
        } else {
            this.nowPlaying.add(movie);
        }
    }
}
