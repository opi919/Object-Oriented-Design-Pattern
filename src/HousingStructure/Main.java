package HousingStructure;

public class Main {
    public static void main(String[] args) {
        Housing apartment1 = new Apartment("101");
        Housing apartment2 = new Apartment("102");
        Housing apartment3 = new Apartment("201");

        // composite structure
        Building building = new Building();
        building.addUnit(apartment1);
        building.addUnit(apartment2);

        Building anotherBuilding = new Building();
        anotherBuilding.addUnit(apartment3);

        building.addUnit(anotherBuilding);

        System.out.println("Displaying building structure:");
        building.display();
    }
}
