package PetManagement;

public class Main {
    public static void main(String[] args) {
        PetManagement petManagement = new PetManagement();

        petManagement.addPet(new Cat("cat",1,"grey"));
        petManagement.addPet(new Dog("dog",1,"bread"));
        petManagement.displayPets();
    }
}
