# Inheritance
A foray into inheritance. This package contains classes for `Reviews`, `Restaurants`, `Shops`, and `Theaters`.

## <a name="thingToReview"></a>thingToReview Interface
This outlines that anything that is reviewed needs a `.addReview(Review newReview)` method and a `.toString()` method.
[Code](../src/main/java/thingToReview.java)

## <a name="Review"></a>Review Class
The Review class implements the `thingToReview` interface and takes in the author, body, and star rating of a review. The constructor contains these as `String name`, `String body`, `int stars`, `Object business`, and `String tag`.
To create a new Review, the code will look like:
`Review bestReview = new Review("Author", "description", starRating);`
[Code](../src/main/java/Review.java) | [Tests](../src/test/java/ReviewTest.java)


### Methods
Method |Description
----| ----
`.getStars()` | This method will get the reviewed star rating for a specific review.
`.toString()` | This method will print out the author, body, and star rating for a specific review.


## <a name="Restaurant"></a>Restaurant Class
The Restaurant class implements the `thingToReview` interface and takes in a restaurant name and price average. The constructor contains the `String name`, `String price`, `int stars`, `List reviews`.
To create a new Restaurant, the code will look like:
`Restaurant oneRestaurant = new Restaurant(String name, String priceInDollar$);`
[Code](../src/main/java/Restaurant.java) | [Tests](../src/test/java/RestaurantTest.java)


### Methods
Method |Description
----| ----
`.addReview(Review newReview)` | This method takes in a review and adds it to the list of reviews for a restaurant.
`.getReviews()` | This method will print out all the reviews for a restaurant.
`.toString()` | This method will print out the name, rating, and average price of a restaurant.
`.updateStars()` | This method updates the star rating for a restaurant.


## <a name="Shop"></a>Shop Class
The Shop class implements the `thingToReview` interface and takes in a name, description, and average dollar price. The constructor contains the `String name`, `String description`, `String priceInDollar$`, `List reviews`
`Shop newShop = new Shop (String name, String description, String priceInDollar$);`
[Code](../src/main/java/Shop.java)  | [Tests](../src/test/java/ShopTest.java)

### Methods
Method |Description
----| ----
`.addReview(Review newReview)` |  This method takes in a review and adds it to the list of reviews for a shop.
`.toString()` | This method will print out all the information for a Shop.


## <a name="Theater"></a>Theater Class
The Theater implements the `thingToReview` interface and class takes in a name. The constructor contains the `String name`, `Set nowPlaying` and `List reviews`.
`Theater newTheater = new Theater(String name);`
[Code](../src/main/java/Theater.java)  | [Tests](../src/test/java/TheaterTest.java)

### Methods
Method |Description
----| ----
`.addMovie(String movie)` | This method takes in a movie to add to the `nowPlaying` list for an instance of a theater.
`.addReview(Review newReview)` | This method takes in a review and adds it to the list of reviews for a shop.
`.addReview(Review newReview, String movie)` | This method takes in a review and adds it to the list of reviews for a theater and adds a movie tag to the review.
`.removeMovie(String movie)` | This method takes in a movie and removes it from the `nowPlaying` list and returns true if the movie is in `nowPlaying`.
`.toString()` | This method will print out all the information for a Theater.
