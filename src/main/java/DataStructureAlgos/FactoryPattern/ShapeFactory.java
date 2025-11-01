package DataStructureAlgos.FactoryPattern;

public class ShapeFactory {

    public Shape getShape(String shapeType){ //here interface type object create

        if (shapeType==null){
            return null;
        }

        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
