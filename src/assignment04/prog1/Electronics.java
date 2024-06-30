package assignment04.prog1;

public class Electronics extends Product{
    private int warranty;
    private double warrantyCost;
    public Electronics(int warranty, double warrantyCost) {
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public String toString() {
        return STR."""
                \{super.toString()}
                Warranty: \{warranty}
                Warranty Cost: \{warrantyCost}
                """;
    }

    @Override
    public double getPrice(){
        return super.getPrice()+warrantyCost;
    }
}
