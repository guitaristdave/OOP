public class Circle : Shape
{
    private int radius;

    public Circle(int radius)
    {
        this.radius = radius;
    }

    public Circle()
    {
        this.radius = 5;
    }
    public double area()
    {
        return Math.Round((Math.PI * this.radius * this.radius), 2);
    }

    public double perimeter()
    {
        return Math.Round((2 * Math.PI * this.radius), 2);
    }

    public override string ToString()
    {
        return $"Круг\nРадиус: {this.radius}\nДлина окружности: {this.perimeter()}\nПлощадь: {this.area()}\n";
    }
}