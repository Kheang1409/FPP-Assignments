package assignment04.prog6.case3;

import prog6.AnimalType;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Tiger", AnimalType.CARNIVORES);
        Animal animal2 = new Animal("Panda", AnimalType.HERBIVORES);

        PetAnimal pet1 = new PetAnimal("KHEANG", animal1);
        PetAnimal pet2 = new PetAnimal("ALEX", animal2);
        PetAnimal pet3 = new PetAnimal("BISNU", new Animal("Bear", AnimalType.OMNIVORES));
        PetAnimal pet4 = pet1;

        System.out.println("pet1.equal(null): "+ pet1.equals(null));
        System.out.println("pet1.equals(pet2): " + pet1.equals(pet2));
        System.out.println("pet1.equals(pet3): " + pet1.equals(pet3));
        System.out.println("pet1.equals(animal1)" + pet1.equals(animal1));
        System.out.println("animal1.equals(pet1): " + animal1.equals(pet1));
        System.out.println("pet1.equals(pet4): " + pet1.equals(pet4));
    }
}
