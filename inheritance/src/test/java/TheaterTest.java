import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void testToString() {

        Theater oneTheater = new Theater("Cinerama");
        assertEquals("Cinerama is not playing any movies", oneTheater.toString());

        oneTheater.nowPlaying.add("Die Hard");
        assertEquals("Cinerama is playing [\"Die Hard\"]", oneTheater.toString());

    }

    @Test
    public void testAddReview() {
    }
}