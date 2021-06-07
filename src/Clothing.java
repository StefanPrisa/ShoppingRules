public class Clothing {
    private final String size;
    private String type;
    private double price;

    static final double MIN_PRICE = 10;
    private static final double TAX_RATE = 0.2;

    public Clothing(String type, double price, String size) {
        this.type = type;
        this.price = price;
        this.size = size;
    }

    public double getPrice() {
        return price * (1+ TAX_RATE);
    }

    public void setPrice(double priceToBeSet) {
        if (priceToBeSet <= MIN_PRICE)
        {
            price = MIN_PRICE;
        } else {
            price = priceToBeSet;
        }

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
