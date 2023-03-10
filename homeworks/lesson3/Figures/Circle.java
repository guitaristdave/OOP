package homeworks.lesson3.Figures;

import homeworks.lesson3.Exceptions.NegativeValueException;
import homeworks.lesson3.Figures.Base.Figure;
import homeworks.lesson3.Figures.Base.Lengthable;

public class Circle extends Figure implements Lengthable {
    private int radius;

    public Circle(int radius) throws NegativeValueException {
        if (radius <= 0) throw new NegativeValueException("Radius must be more than zero");
        this.radius = radius;
    }

    public Circle() throws NegativeValueException{
        this.radius = 7;
    }

    @Override
    public double length() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return String.format("Круг\nРадиус: %d", this.radius);
    }

}
