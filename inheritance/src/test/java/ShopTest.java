//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class ShopTest {
//
//    @Test
//    public void testToString() {
//
//        Shop oneShop = new Shop("Anthro", "sell clothes", "$$");
//
//        assertEquals("Anthro has a price rating of : $$\nAbout: sell clothes", oneShop.toString());
//        assertTrue("Expect to have name Anthro", (oneShop.toString()).contains("Anthro"));
//        assertTrue("Expect to 'sell clothes", (oneShop.toString()).contains("sell clothes"));
//    }
//
//    @Test public void testAddReview() {
//
//        Shop oneShop = new Shop("Anthro", "sell clothes", "$$");
//
//        assertEquals("Reviews should be empty", null, oneShop.reviews);
//
//        Review oneRev = new Review("Everything is velvet", "Jessica", 5);
//        oneShop.addReview(oneRev);
//
//        assertEquals("Reviews list has 1 thing", 1, (oneShop.reviews).size());
//
//        Review twoRev = new Review("has nice couches", "Albert", 4);
//        oneShop.addReview(twoRev);
//
//        assertEquals("Reviews list has 2 things", 2, (oneShop.reviews).size());
//    }
//}