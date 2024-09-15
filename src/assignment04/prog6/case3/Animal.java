package assignment04.prog6.case3;

import prog6.AnimalType;

public class Animal {
    private String name;
    private AnimalType animalType;
    public Animal(String name, AnimalType animalType) {
        this.name = name;
        this.animalType = animalType;
    }
    public String getName() {
        return name;
    }
    public AnimalType getAnimalType() {
        return animalType;
    }
    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }
    public void setName(String name) {
        this.name = name;
    }
}
