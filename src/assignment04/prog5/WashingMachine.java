package assignment04.prog5;

public class WashingMachine implements HomeService {
    private int loadCapacity;

    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {

        return loadCapacity;

    }

    @Override
    public void performFunction() {
        System.out.println(STR."Starting wash cycle with load capacity: \{loadCapacity} kg.");
    }
}
