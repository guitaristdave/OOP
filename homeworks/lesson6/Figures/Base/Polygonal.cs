public abstract class Polygonal : Figure, Perimeterable
{
    protected int[] sides;

    public Polygonal(int[] sides)
    {
        this.sides = sides;
    }

    public double perimeter()
    {
        double result = 0;
        foreach (int side in this.sides)
        {
            result += side;
        }
        return result;
    }
}