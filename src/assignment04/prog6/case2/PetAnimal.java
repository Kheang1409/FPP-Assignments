package prog6.case2;


import prog6.AnimalType;

public class PetAnimal extends Animal {

    private String ownerName;

    public PetAnimal(String name, AnimalType animalType, String ownerName) {
        super(name, animalType);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String owner_name) {
        this.ownerName = owner_name;
    }

    @Override
    public boolean equals(Object withPet) {
        if(withPet == null) return false;
        if(getClass() != withPet.getClass()) return false;
        PetAnimal p = (PetAnimal) withPet;
        return
            p.ownerName.equals(ownerName)
                ? p.getAnimalType().equals(getAnimalType())
                    ? p.getName().equals(getName()) ?
                    true : false:
                false :
            false;
    }
}