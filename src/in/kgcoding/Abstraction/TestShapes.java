package in.kgcoding.Abstraction;

public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square sqr = new Square(10.3);

        System.out.printf("Area of circle is %f\n", circle.calculateArea());
        System.out.printf("Area of square is %f\n", sqr.calculateArea());
    }
}
