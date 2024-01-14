package Assignment_4;

public interface Main {
    public static void main(String[] args) {
        // leaf node
        HousingStructure room1 = new Room("101");
        HousingStructure room2 = new Room("102");
        HousingStructure room3 = new Room("201");
        HousingStructure room4 = new Room("202");

        // composite node
        HousingStructure apartment1 = new Apartment("1A");
        apartment1.add(room1);
        apartment1.add(room2);

        HousingStructure apartment2 = new Apartment("2A");
        apartment2.add(room3);
        apartment2.add(room4);

        // main composite node
        HousingStructure building = new Building("My Home");
        building.add(apartment1);
        building.add(apartment2);

        building.display();
    }
}
