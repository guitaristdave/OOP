public class Triangle : Polygon
{
    public Triangle(int a, int b, int c) : base(new int[] {a, b, c})
    {
        
    }

    public Triangle() : base(new int[] {3, 4, 5})
    {
        
    }

    public override double area()
    {
        double p = this.perimeter() / 2;
        double side1 = base.sides[0];
        double side2 = base.sides[1];
        double side3 = base.sides[2];
        return Math.Round((Math.Sqrt(p * (p - side1) * (p - side2) * (p - side3))), 2);
    }

    public override string ToString()
    {
        return $"Треугольник\nДлины сторон: {base.sides[0]} {base.sides[1]} {base.sides[2]}\nПериметр: {this.perimeter()}\nПлощадь: {this.area()}\n";
    }
}