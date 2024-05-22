public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Pentagon pentagon = new Pentagon();

        ShapeToPrint circleShapeToPrint = new ShapeToPrint(circle);
        ShapeToPrint triangleShapeToPrint = new ShapeToPrint(triangle);
        ShapeToPrint squareShapeToPrint = new ShapeToPrint(square);
        ShapeToPrint rectangleShapeToPrint = new ShapeToPrint(rectangle);
        ShapeToPrint pentagonShapeToPrint = new ShapeToPrint(pentagon);

        }
    }
