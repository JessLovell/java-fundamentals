# Inheritance
## Restaurant Class
The Restaurant class takes in a restaurant name and price average. The constructor contains the `String name`, `String price`, `int stars`, `List reviews`.
[Code](../src/main/java/Restaurant.java) | [Tests](../src/test/java/RestaurantTest.java)

To create a new Restaurant, the code will look like:
`Restaurant oneRestaurant = new Restaurant("Name", "$$$");`

### Methods
Method |Description
----| ----
`.addReview(Review newReview)` | This method takes in a review and adds it to the list of reviews for a restaurant.
`.getReviews()` | This method will print out all the reviews for a restaurant.
`.toString()` | This method will print out the name, rating, and average price of a restaurant.
`.updateStars()` | This method updates the star rating for a restaurant.

## Review Class
The Review class takes in the author, body, and star rating of a review. The constructor contains these as `String name`, `String body`, `int stars`, and `Object business`.
[Code](../src/main/java/Review.java) | [Tests](../src/test/java/RestaurantTest.java)

To create a new Review, the code will look like:
`Review bestReview = new Review("Author", "description", starRating);`

### Methods
Method |Description
----| ----
`.getStars()` | This method will get the reviewed star rating for a specific review.
`.toString()` | This method will print out the author, body, and star rating for a specific review.
