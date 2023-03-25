public class Square : Rectangle
{
    public Square(int a) : base(a, a)
    {
        
    }

    public Square() : base(5, 5)
    {
        
    }

    public override string ToString()
    {
        return $"Квадрат\nДлины сторон: {base.sides[0]} {base.sides[1]}\nПериметр: {this.perimeter()}\nПлощадь: {this.area()}\n";
    }
}