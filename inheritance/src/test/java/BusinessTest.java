import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class BusinessTest {

    Restaurant one;
    Theater two;
    Shop three;


    @Test
    public void testBusinessConstructor(){

        one = new Restaurant("Danny's", "Pike", "Pizza","$$$");
        assertEquals("$$$", one.getPrice());

        two = new Theater("Reagle Cinema", "Pine + 6th", "New Movies");
        assertEquals(null, two.nowPlaying);


        three =  new Shop("American Eagle", "Pine + 7th", "Clothing for people", "$$");
        assertEquals("$$", three.getPrice());
    }


    @Test
    public void testGetName() {

        assertEquals("Danny's", one.getName());
        assertEquals("Reagle Cinema", two.getName());
        assertEquals("American Eagle", three.getName());
    }

    @Test
    public void testGetLocation() {

        assertEquals("Pike", one.getLocation());
        assertEquals("Pine + 6th", two.getLocation());
        assertEquals("Pine + 7th", three.getLocation());
    }

    @Test
    public void testGetDescription() {

        assertEquals("Pizza", one.getDescription());
        assertEquals("New Movies", two.getDescription());
        assertEquals("Clothing for people", three.getDescription());
    }

    @Test
    public void testGetReviews() {

        assertEquals(0, one.getReviews().size());
        assertEquals(0, two.getReviews().size());
        assertEquals(0, three.getReviews().size());
    }

    @Test
    public void testGetRating() {

        assertEquals(0, one.getRating());
        assertEquals(0, two.getRating());
        assertEquals(0, three.getRating());
    }

    @Test
    public void testAddShopReview() {
        Review oneRev = new Review("Everything is velvet", "Jessica", 5);
        three.addReview(oneRev);
        assertEquals("Reviews list has 1 thing", 1, three.getReviews().size());

        Review twoRev = new Review("has nice couches", "Albert", 4);
        three.addReview(twoRev);
        assertEquals("Reviews list has 2 things", 2, three.getReviews().size());
    }

    @Test
    public void testAddRestaurantReview(){

    }

    @Test
    public void testAddInputReview() {
    }

    @Test
    public void testToString() {
    }
}