package homeworks.lesson3.Figures.Base;

import homeworks.lesson3.Exceptions.IncorrectTriangleException;
import homeworks.lesson3.Exceptions.NegativeValueException;

public abstract class Polygonal extends Figure implements Perimetrable {
    protected String[] sides;

    protected Polygonal(String[] sides) throws NegativeValueException, IncorrectTriangleException{
        if (!isNumeric(sides))
            throw new NumberFormatException("Value must be numberic");
        if (hasNegative(sides))
            throw new NegativeValueException("Value must be more than 0");
        if (sides.length == 3 && !isTriangle(sides)) throw new IncorrectTriangleException("Triangle is incorrect");
        this.sides = sides;
    }

    @Override
    public double perimeter() {
        double result = 0;
        for (String side : sides) {
            result += Double.parseDouble(side);
        }
        return result;
    }

    private boolean hasNegative(String[] sides) {
        boolean result = false;
        for (String side : sides) {
            if (Double.parseDouble(side) < 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    private boolean isNumeric(String[] sides) {
        boolean result = true;
        for (String side : sides) {
            try {
                Double.parseDouble(side);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return result;
    }

    private boolean isTriangle(String[] sides) {
        if (Double.parseDouble(sides[0]) + Double.parseDouble(sides[1]) <= Double.parseDouble(sides[2])
                || Double.parseDouble(sides[0]) + Double.parseDouble(sides[2]) <= Double.parseDouble(sides[1])
                || Double.parseDouble(sides[2]) + Double.parseDouble(sides[1]) <= Double.parseDouble(sides[0]))
            return false;
        else
            return true;
    }
}
