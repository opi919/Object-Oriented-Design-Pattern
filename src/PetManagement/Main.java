package PetManagement;

public class Main {
    public static void main(String[] args) {
        PetManagement petManagement = new PetManagement();

        petManagement.addPet(new Cat("kitty",1,"grey"));
        petManagement.displayPets();
    }
}
