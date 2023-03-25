public class Circle : Figure, Lenghtable
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
    
    public double length()
    {
        return 2 * Math.PI * this.radius;
    }

    public override double area()
    {
        return Math.PI * this.radius * this.radius;
    }

    public override string ToString()
    {
        return "Круг\nРадиус: " + this.radius;
    }
}