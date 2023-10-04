package PetManagement;

public class Dog extends Pet {
    private final String food;

    public Dog(String name, int age, String food) {
        super(name, age);
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}
