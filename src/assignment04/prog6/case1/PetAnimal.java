package assignment04.prog6.case1;

import prog6.AnimalType;

public class PetAnimal extends Animal {
    private String ownerName;

    PetAnimal(String name, AnimalType type, String ownerName) {
        super(name, type);
        this.ownerName = ownerName;

    }

    public String getOwnerName() {
        return ownerName;
    }
}
