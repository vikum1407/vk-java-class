package DataStructureAlgos.FactoryPattern;

import DataStructureAlgos.FactoryPattern.Shape;
import DataStructureAlgos.FactoryPattern.ShapeFactory;

public class FactoryPatternCliendCode {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
