public class Rectangle : Polygon
{

    public Rectangle(int a, int b) : base(new int[] {a, b, a, b})
    {
        
    }

    public Rectangle() : base(new int[] {3, 5, 3, 5})
    {
        
    }
    public override double area()
    {
        return base.sides[0] * this.sides[1];
    }

    public override string ToString()
    {
        return $"Прямоугольник\nДлины сторон: {base.sides[0]} {base.sides[1]}\nПериметр: {this.perimeter()}\nПлощадь: {this.area()}\n";
    }
}
