package assignment04.prog6.case1;

import prog6.AnimalType;

public class AnimalTest {
    public static void main(String[] args) {

        Animal a1 = new Animal("Cow", AnimalType.HERBIVORES);
        Animal a2 = new Animal("Cow", AnimalType.HERBIVORES);
        Animal a3 = new Animal("Monkey", AnimalType.HERBIVORES);
        Animal a4 = new Animal("Bear", AnimalType.CARNIVORES);

        System.out.println("a1.equals(a2) : " + a1.equals(a2));
        System.out.println("a2.equals(a3) : " + a3.equals(a4));


        PetAnimal pa1 = new PetAnimal("Cow", AnimalType.HERBIVORES, "Harry");
        PetAnimal pa2 = new PetAnimal("Dog", AnimalType.OMNIVORES, "Kheang");


        System.out.println("a1.equals(pa1) : " + a1.equals(pa1));                                //true
        System.out.println(pa1 instanceof Animal);

    }
}
