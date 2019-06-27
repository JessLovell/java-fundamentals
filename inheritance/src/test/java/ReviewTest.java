//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class ReviewTest {
//
//    @Test public void testReviewToString(){
//        Review oneReview = new Review("It's alright.", "Jessica", 3);
//
//        Restaurant twoRest = new Restaurant("applebees", "$$$");
//        Review twoReview = new Review("", "", 2);
//        twoRest.addReview(twoReview);
//
//        assertEquals("Jessica rated this with 3 stars\n Review: 'It's alright.'", oneReview.toString());
//        assertEquals(" rated this with 2 stars\n Review: ''", twoReview.toString());
//    }
//
//    @Test public void testReviewGetStars(){
//
//        Review oneReview = new Review("It's alright.", "Jessica", 3);
//        Review twoReview = new Review("", "", 2);
//
//        assertEquals(3, oneReview.getStars());
//        assertNotEquals(0,oneReview.getStars());
//        assertEquals(2, twoReview.getStars());
//    }
//}