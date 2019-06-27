import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Theater extends Business{

    protected Set<String> nowPlaying;

    public Theater(String name, String location, String description){
        super(name, location, description);
        this.nowPlaying = null;
    }

    //this method prints out the theater instance as a string
    @Override
    public String toString() {
        if (nowPlaying == null) {
            return this.getName() + " is not playing any movies";
        }
        return this.getName() + " is playing " + this.nowPlaying;
    }

    //This review adds a review about a specifc movie
    public void addMovieReview(Review newReview, String movie){
        addReview(newReview);
        newReview.tag = movie; //adds the movie as a tag to the review
    }

    //this method adds a movie to the nowPlaying list
    public void addMovie(String movie) {

        //check if the list is empty
        if(this.nowPlaying == null) {
            Set<String> movieList = new HashSet<>();
            movieList.add(movie);
            this.nowPlaying = movieList;
        } else {
            this.nowPlaying.add(movie);
        }
    }

    //this method returns true if a movie is removed from nowPlaying list and returns false if the movie is not in the set
    public boolean removeMovie(String movie){

        if (this.nowPlaying != null) {
            return this.nowPlaying.remove(movie);
        }
        return false;
    }
}
