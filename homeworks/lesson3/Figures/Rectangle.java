package homeworks.lesson3.Figures;

import homeworks.lesson3.Exceptions.IncorrectTriangleException;
import homeworks.lesson3.Exceptions.NegativeValueException;
import homeworks.lesson3.Figures.Base.Polygonal;

public class Rectangle extends Polygonal {

    public Rectangle(int sideA, int sideB) throws NegativeValueException, IncorrectTriangleException{
        super(new int[] { sideA, sideB, sideA, sideB });
    }

    public Rectangle() throws NegativeValueException, IncorrectTriangleException{
        this(3, 4);
    }

    @Override
    public double area() {
        return sides[0] * sides[1];
    }
    

    @Override
    public String toString() {
        return String.format("Прямоугольник\nСторона a: %d\nСторона b: %d", sides[0], sides[1]);
    }
}
