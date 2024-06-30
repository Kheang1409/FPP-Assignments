package assignment04.prog1;

public class Furniture extends Product{
    private String meterail;
    private double shippingCost;

    public Furniture(String meterail, double shippingCost) {
        this.meterail = meterail;
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return STR."""
                \{super.toString()}
                Meterail: \{meterail}
                Shipping Cost: \{shippingCost}
                """;
    }

    @Override
    public double getPrice(){
        return super.getPrice()+shippingCost;
    }
}