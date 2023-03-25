internal class Program
{
    private static void Main(string[] args)
    {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        List<Shape> storage = new List<Shape>();
        storage.Add(circle);
        storage.Add(square);
        storage.Add(rectangle);
        storage.Add(triangle);

        double area = circle.area();
        double perimeter = square.perimeter();

        Console.WriteLine(area);
        Console.WriteLine(perimeter);

        listPrinter(storage);

    }

    public static void listPrinter(List<Shape> storage) {
        foreach (var item in storage)
        {
            Console.WriteLine(item);
        }
    }
}