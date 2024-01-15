package Assignment_2;

public class PetCareService {
    public void groomPet(Pet pet) {
        System.out.println("Grooming pet: " + pet.getName());
    }

    public void feedPet(Pet pet) {
        System.out.println("Feeding pet: " + pet.getName());
    }

    public void playWithPet(Pet pet) {
        System.out.println("Playing with pet: " + pet.getName());
    }
}
