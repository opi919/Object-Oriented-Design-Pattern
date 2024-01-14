package Assignment_4;

import java.util.ArrayList;
import java.util.List;

class Building implements HousingStructure {
    private String name;
    private List<HousingStructure> structures;

    public Building(String name) {
        this.name = name;
        this.structures = new ArrayList<>();
    }

    @Override
    public void add(HousingStructure structure) {
        structures.add(structure);
    }

    @Override
    public void remove(HousingStructure structure) {
        structures.remove(structure);
    }

    @Override
    public void display() {
        System.out.println("Building: " + name);
        for (HousingStructure structure : structures) {
            structure.display();
        }
    }
}
