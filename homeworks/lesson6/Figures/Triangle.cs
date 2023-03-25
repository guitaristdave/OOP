public class Triangle : Polygonal
{

    public Triangle(int a, int b, int c) : base(new int[] { a, b, c })
    {

    }

    public Triangle() : base(new int[] { 3, 4, 5 })
    {

    }
    public override double area()
    {
        double p = perimeter() / 2;
        double side1 = base.sides[0];
        double side2 = base.sides[1];
        double side3 = base.sides[2];
        return Math.Sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

public override string ToString()
    {
        return "Треугольник\nСторона a: " + base.sides[0] + "\nСторона b: " + base.sides[1] + "\nСторона c: " + base.sides[2];
    }
}