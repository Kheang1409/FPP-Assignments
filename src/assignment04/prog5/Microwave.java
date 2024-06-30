package assignment04.prog5;

public class Microwave implements HomeService {
    private int powerLevel;

    public Microwave(int powerLevel) {

        this.powerLevel = powerLevel;

    }

    public int getPowerLevel() {

        return powerLevel;
    }

    public String heatFood() {
        return STR."Heating food at power level: \{powerLevel}";
    }

    @Override
    public void performFunction() {

        System.out.println(STR."Heating food at power level \{powerLevel}");

    }
}
