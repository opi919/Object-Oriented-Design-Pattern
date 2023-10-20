package DecoratorPattern;

import FactoryPattern.Circle;
import FactoryPattern.Shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        ShapeDecorator circle = new ShapeDecorator(new Circle());
        circle.draw();

        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
    }
}
