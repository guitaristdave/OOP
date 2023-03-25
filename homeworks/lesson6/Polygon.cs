public abstract class Polygon : Shape
{
    protected int[]? sides;

    public Polygon(int[] sides)
    {
        this.sides = sides;
    }

    public abstract double area();
    public double perimeter()
    {
        double res = 0;
        foreach (int side in this.sides)
        {
            res += side;
        }
        return res;
    }
}