package Assignment_2;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private List<Pet> availablePets;

    public PetShop() {
        this.availablePets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        availablePets.add(pet);
    }

    public void adoptPet(Pet pet) {
        availablePets.remove(pet);
        System.out.println("You have adopted " + pet.displayPet() + "!");
    }

    public void displayPets() {
        for (Pet pet : availablePets) {
            System.out.println(pet.displayPet());
        }
    }
}
