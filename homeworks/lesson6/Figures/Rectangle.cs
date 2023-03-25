public class Rectangle : Polygonal
{
    public Rectangle(int a, int b) : base(new int[] {a, b, a, b})
    {

    }

    public Rectangle() : base(new int[] {2, 3, 2, 3})
    {
        
    }

    public override double area()
    {
        return base.sides[0] * base.sides[1];
    }

    public override string ToString()
    {
        return "Прямоугольник\nСторона a: " + base.sides[0] + "\nСторона b: " + base.sides[1];
    }
}