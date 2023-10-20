package FactoryPattern;

public class ShapeFactory {
    public Shape getShape(String stringType){
        if(stringType.equalsIgnoreCase("circle"))
            return new Circle();
        else if(stringType.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if(stringType.equalsIgnoreCase("square"))
            return new Square();
        else return null;
    }
}
