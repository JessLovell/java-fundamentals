import com.sun.javafx.scene.control.skin.TableHeaderRow;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test public void testToString() {

        Theater oneTheater = new Theater("Cinerama");
        assertEquals("Cinerama is not playing any movies", oneTheater.toString());

        oneTheater.addMovie("Die Hard");
        assertEquals("Cinerama is playing [Die Hard]", oneTheater.toString());

        oneTheater.addMovie("The Grinch");
        assertTrue("expect to have 'The Grinch'", (oneTheater.toString()).contains("The Grinch"));
    }

    @Test public void testaddMovie() {

        Theater oneTheater = new Theater("Cinerama");
        assertEquals("expect nowPlaying to be empty", null, oneTheater.nowPlaying);

        oneTheater.addMovie("Die Hard");
        assertEquals("expect 'Die Hard' in nowPlaying", true, (oneTheater.nowPlaying).contains("Die Hard"));
        assertEquals("expect 'Die Hard' in nowPlaying", "[Die Hard]", (oneTheater.nowPlaying).toString());

        oneTheater.addMovie("The Grinch");
        oneTheater.addMovie("Die Hard");
        assertEquals("expect 1 instance of 'Die Hard'", "[The Grinch, Die Hard]", (oneTheater.nowPlaying).toString());

    }

    @Test public void testRemoveMovie() {

        Theater oneTheater = new Theater("Cinerama");

        assertTrue("expect nowPlaying to be empty", null == oneTheater.nowPlaying);

        oneTheater.addMovie("Die Hard");
        oneTheater.addMovie("The Grinch");
        oneTheater.addMovie("5th Avenue");

        assertTrue("expect movies in nowPlaying", null != oneTheater.nowPlaying);
        assertTrue("expect The Grinch in nowPlaying", (oneTheater.nowPlaying).contains("The Grinch"));
        assertTrue("expect to return True on removal of 'The Grinch'",  oneTheater.removeMovie("The Grinch"));
        assertFalse("expect The Grinch to be removed", (oneTheater.nowPlaying).contains("The Grinch"));
        assertFalse("expect False because 'The Grinch' is removed", oneTheater.removeMovie("The Grinch"));
        assertEquals("expect Die Hard and 5th Avenue in NowPlaying", "[5th Avenue, Die Hard]", (oneTheater.nowPlaying).toString());
    }

    //Test both instances of addReview
    @Test public void testAddReview() {

        Theater oneTheater = new Theater("Cinerama");
        assertEquals("Expect reviews to be empty", null, oneTheater.reviews);

        Review oneReview = new Review("Best popcorn!", "Jessica", 3);
        oneTheater.addReview(oneReview);
        assertEquals("Expect to have 1 thing in reviews", 1, oneTheater.reviews.size());
        assertTrue("Expect to contain 'Jessica'", (oneTheater.reviews.toString()).contains("Jessica"));

        Review twoReview = new Review("Don't watch. The dog dies at the end", "Chad", 5);
        oneTheater.addReview(twoReview, "Old Yeller");
        assertEquals("Expect to have 2 things in reviews", 2, oneTheater.reviews.size());
        assertTrue("Expect to contain 'Old Yeller'", (oneTheater.reviews.toString()).contains("Old Yeller"));
    }
}