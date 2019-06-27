public class Shop extends Business{
    private String price;

    public Shop(String name, String location, String description, String price) {
        super(name,location, description);
        this.price = price;
    }

    public String getPrice(){
        return this.price;
    }

    //This method will print the details of the shop: name, description, and average price
    @Override
    public String toString() {

        return super.toString() + "\nhas a price rating of " + this.price;
    }
}
