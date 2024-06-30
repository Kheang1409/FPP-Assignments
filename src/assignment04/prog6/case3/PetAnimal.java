package prog6.case3;

class PetAnimal {

    String owerName;
    Animal animal;

    public PetAnimal(String owerName, Animal animal) {
        this.owerName = owerName;
        this.animal = animal;
    }
    public String getOwnerName() {
        return owerName;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void setOwnerName(String owerName) {
        this.owerName = owerName;
    }

    @Override
    public boolean equals(Object ob) {
        if(ob == null) {
            return false;
        }
        if(ob.getClass() != this.getClass()){
            return false;
        }
        if(this == (PetAnimal)ob) {
            return true;
        }
        PetAnimal p = (PetAnimal)ob;
        return (p.animal.getName().equals(this.animal.getName())
                &&
            p.animal.getAnimalType().equals(this.animal.getAnimalType())
                &&
            p.getOwnerName().equals(this.owerName));
    }
}
