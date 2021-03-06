/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class RestaurantTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test public void testToString() {

       Restaurant oneRest = new Restaurant("Blue Moon", "$$$");
       Restaurant twoRest = new Restaurant("Oddfellows", "$$");

       assertEquals("Blue Moon is rated 0 and priced at $$$", oneRest.toString());
       assertEquals("Oddfellows is rated 0 and priced at $$", twoRest.toString());
       assertTrue((oneRest.toString()).contains("Blue Moon"));
       assertTrue((twoRest.toString()).contains("Oddfellows"));
    }

    //This test will test both addReview and getReview methods
    @Test public void testAddGetReview() {

        Restaurant oneRest = new Restaurant("Blue Moon", "$$$");
        Restaurant twoRest = new Restaurant("Oddfellows", "$$");

        //test that getReviews is empty
        assertEquals("reviews should be empty",null, oneRest.reviews);
        assertEquals("reviews should be empty", null, twoRest.reviews);

        Review oneReview = new Review("It's alright.", "Jessica", 3);
        Review twoReview = new Review ("My favorite place to be be!", "Igor", 5);
        oneRest.addReview(oneReview);

        Review threeRev = new Review("Hi", "me", 0);
        Review fourRev = new Review("", "", 4);
        twoRest.addReview(threeRev);

        //test that reviews is not empty
        assertEquals("have 1 review", 1, oneRest.reviews.size());
        assertEquals("have 1 review", 1, twoRest.reviews.size());


        oneRest.addReview(twoReview);
        twoRest.addReview(fourRev);

        //Test that more reviews were added
        assertEquals("have 2 review", 2, oneRest.reviews.size());
        assertEquals("have 2 review", 2, twoRest.reviews.size());

        oneRest.getReviews();
    }

    @Test public void testUpdateStars() {

        Restaurant oneRest = new Restaurant("Blue Moon", "$$$");
        Restaurant twoRest = new Restaurant("Oddfellows", "$$");

        //test inital stars
        assertEquals("Expect to be empty", 0, oneRest.stars);
        assertEquals("Expect to be empty", 0, twoRest.stars);

        Review oneReview = new Review("It's alright.", "Jessica", 3);
        Review twoReview = new Review ("My favorite place to be be!", "Igor", 5);
        oneRest.addReview(oneReview);
        oneRest.addReview(twoReview);

        Review threeRev = new Review("Hi", "me", 0);
        Review fourRev = new Review("", "", 4);
        twoRest.addReview(threeRev);
        twoRest.addReview(fourRev);

        //test for stars
        assertTrue("Should not be 0",oneRest.stars == 4);
        assertEquals("Should not be empty",4, oneRest.stars);
        assertTrue("Should not be empty",twoRest.stars == 2);
        assertEquals("Should not be empty",2, twoRest.stars);

        oneRest.addReview(threeRev);
        twoRest.addReview(oneReview);

        //test for stars update
        assertEquals("Should have changed from 4",2, oneRest.stars);
        assertEquals("Shouldn't have changed from 4",2, twoRest.stars);
    }
}
