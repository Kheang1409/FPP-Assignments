package assignment04.prog6.case1;

import prog6.AnimalType;

public class Animal {
    private String name;
    private AnimalType type;

    Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }

    @Override
    public boolean equals(Object animal) {
        if (animal == null) return false;
        if (!(animal instanceof Animal)) return false;
        Animal animal1 = (Animal) animal;
        return animal1.name.equals(name) && animal1.type.equals(type);

    }


}
