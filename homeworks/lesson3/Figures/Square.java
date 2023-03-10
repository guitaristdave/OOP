package homeworks.lesson3.Figures;

import homeworks.lesson3.Exceptions.IncorrectTriangleException;
import homeworks.lesson3.Exceptions.NegativeValueException;

public class Square extends Rectangle{
    
    public Square(int side) throws NegativeValueException, IncorrectTriangleException{
        super(side, side);
    }

    public Square() throws NegativeValueException, IncorrectTriangleException{
        this(6);
    }

    @Override
    public String toString() {
        return String.format("Квадрат\nСторона: %d", sides[0]);
    }
}
