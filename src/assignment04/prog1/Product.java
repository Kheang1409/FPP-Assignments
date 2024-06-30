package assignment04.prog1;

public class Product {
    private String productName;
    private double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return STR."""
            Name: \{productName}
            Price: \{price}""";
    }
}