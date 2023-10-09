package HousingStructure;

import java.util.ArrayList;
import java.util.List;

class Building implements Housing {
    private List<Housing> units = new ArrayList<>();

    @Override
    public void display() {
        System.out.println("Building");

        for (Housing unit : units) {
            unit.display();
        }
    }

    public void addUnit(Housing unit) {
        units.add(unit);
    }

    public void removeUnit(Housing unit) {
        units.remove(unit);
    }
}