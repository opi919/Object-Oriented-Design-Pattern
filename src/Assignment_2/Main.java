package Assignment_2;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Doggy", 5, "dog");
        Pet cat1 = new Pet("Catty1", 5, "cat");
        Pet cat2 = new Pet("Catty2", 5, "cat");

        PetShop petShop = new PetShop();
        petShop.addPet(dog);
        petShop.addPet(cat1);
        petShop.addPet(cat2);

        // Display available pets in the pet shop
        petShop.displayPets();

        // Adopt a pet
        petShop.adoptPet(cat1);
        petShop.displayPets();

        PetCareService petCareService = new PetCareService();
        petCareService.feedPet(dog);
    }
}
