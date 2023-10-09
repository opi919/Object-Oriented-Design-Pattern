package HousingStructure;

class Apartment implements Housing {
    private String unitNumber;

    public Apartment(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    @Override
    public void display() {
        System.out.println("Apartment " + unitNumber);
    }
}
