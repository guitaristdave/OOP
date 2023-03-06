package practice.lesson2;

public class Program {
    public static void main(String[] args) {
        Figure circle = new Circle(-12);
        // Figure square = new Square(15);
        // Figure rectangle = new Rectangle(11, 12);
        // Figure triangle = new Triangle(10, 10, 10);
        demo(circle);
        // demo(square);
        // demo(rectangle);
        // demo(triangle);
        
    }

    static void demo (Figure obj) {
        System.out.println(obj.getClass().getSimpleName());
        System.out.printf("S: %.2f\n", obj.getArea());
        System.out.printf("P: %.2f\n", obj.getPerimeter());
    }
}
