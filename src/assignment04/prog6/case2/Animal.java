package prog6.case2;

import prog6.AnimalType;

public class Animal {
    private String name;
    AnimalType animalType;

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

    @Override
    public boolean equals(Object aAnimal) {
        if (aAnimal == null)
            return false;
        if (aAnimal.getClass() != this.getClass())
            return false;
        if (aAnimal == this)
            return true;
        Animal p = (Animal) aAnimal;
        return
            this.name.equals(p.name)
                ? this.animalType.equals(p.animalType) ?
                true : false :
            false;
    }
}
