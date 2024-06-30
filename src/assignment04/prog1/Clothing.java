package assignment04.prog1;

public class Clothing extends Product{
    private String brand;
    private double discountPercentage;

    public Clothing(String brand, double discountPercentage) {
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }
    @Override
    public String toString() {
        return STR."""
                \{super.toString()}
                Branch: \{brand}
                Discount Percentage: \{discountPercentage}%
                Dis. Price: \{getPrice()}
                """;
    }

    @Override
    public double getPrice(){
        return super.getPrice()-super.getPrice()*(discountPercentage/100);
    }
}
