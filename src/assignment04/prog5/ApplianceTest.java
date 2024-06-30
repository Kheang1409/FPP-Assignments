package assignment04.prog5;

public class ApplianceTest {
    public static void main(String[] args) {
        HomeService[] appliances = {new WashingMachine(7), new Refrigerator(4), new Microwave(800)};

        for (HomeService appliance : appliances) {
            System.out.println(appliance.getClass().getSimpleName());
            appliance.performFunction();
            
        }
    }
}
