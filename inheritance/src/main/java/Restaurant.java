import java.util.LinkedList;
import java.util.List;

/*
 *
 */
public class Restaurant extends Business {

    private String price;
    private List<String> menu;

    public Restaurant (String name, String location, String description, String price) {
        super(name, location, description);
        this.price = price;
        this.menu = new LinkedList<>();
    }

    public String getPrice(){
        return this.price;
    }

    // Method toString outputs the name, rating, and price of a restaurant
    @Override
    public String toString(){
        return super.toString() + "\nhas a price rating of " + this.price;
    }
}
