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
        return "Квадрат\nСторона: " + base.sides[0];
    }
}
