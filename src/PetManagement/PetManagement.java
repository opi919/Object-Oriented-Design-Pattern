package PetManagement;
import java.util.ArrayList;

public class PetManagement {
    public final ArrayList<Pet> pets;


    public PetManagement() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void displayPets() {
        for (Pet pet : pets) {
            System.out.print("Name: " + pet.getName() + ", Age: " + pet.getAge()+", ");
            if (pet instanceof Dog) {
                System.out.println("Food: " + ((Dog) pet).getFood());
            } else if (pet instanceof Cat) {
                System.out.println("Color: " + ((Cat) pet).getColor());
            }
            System.out.println();
        }
    }
}