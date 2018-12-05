import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testToString() {

        Theater oneTheater = new Theater("Cinerama");
        assertEquals("Cinerama is not playing any movies", oneTheater.toString());

        oneTheater.addMovie("Die Hard");
        assertEquals("Cinerama is playing [Die Hard]", oneTheater.toString());

        oneTheater.addMovie("The Grinch");
        assertTrue("expect to have 'The Grinch'", (oneTheater.toString()).contains("The Grinch"));

    }

    @Test
    public void testAddReview() {
    }
}