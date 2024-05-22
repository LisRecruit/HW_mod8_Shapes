public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape pentagon = new Pentagon();

        ShapeToPrint print = new ShapeToPrint();

        print.print(circle);
        print.print(triangle);
        print.print(square);
        print.print(rectangle);
        print.print(pentagon);

    }
}
