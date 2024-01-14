package Assignment_4;

public class Room implements HousingStructure {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void add(HousingStructure structure) {
        // Leaf node cannot have children
        System.out.println("Cannot add to a single room.");
    }

    @Override
    public void remove(HousingStructure structure) {
        // Leaf node cannot have children
        System.out.println("Cannot remove from a single room.");
    }

    @Override
    public void display() {
        System.out.println("Single Room: " + name);
    }
}
