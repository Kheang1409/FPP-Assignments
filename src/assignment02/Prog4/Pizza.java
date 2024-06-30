package assignment02.Prog4;

public class Pizza {
    private PizzaSize pizzaSize;
    private PizzaType pizzaType;
    private int quantity = 1;
    private double price = 0.0;
    final private static double tax = 0.03;

    private void calculatePrice() {

        double sizePrice = switch (pizzaSize){
            case LARGE -> 12.00;
            case MEDIUM -> 10.00;
            case SMALL -> 8.00;
            default -> 8.00;
        };
        double typePrice = switch (pizzaType){
            case VEGGIE -> 1.00;
            case PEPPERONI -> 2.00;
            case CHEEZE -> 1.50;
            case BBQ_CHICKEN -> 2.00;
            default -> 1.50;
        };
        price = (sizePrice+typePrice)*quantity;
    }

    public Pizza(PizzaSize pizzaSize, PizzaType pizzaType, int quantity) {
        this.pizzaSize = pizzaSize;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        calculatePrice();
    }
    public double calculateTax(){
        return price*tax;
    }
    public String printOrderSummary(){
        return STR."""
                Pizza Order:
                Size: \{pizzaSize}
                Type: \{pizzaType}
                Qty: \{quantity}
                Price: $\{String.format("%.2f", price)}
                Tax: $\{String.format("%.2f", calculateTax())}
                Total Price: $\{String.format("%.2f",price+calculateTax())}
                """;

    }
}
