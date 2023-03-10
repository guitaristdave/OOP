package homeworks.lesson3.Figures;

import homeworks.lesson3.Exceptions.NegativeValueException;
import homeworks.lesson3.Figures.Base.Figure;
import homeworks.lesson3.Figures.Base.Lengthable;

public class Circle extends Figure implements Lengthable {
    private String radius;

    public Circle(String radius) throws NegativeValueException {
        if (!isNumeric(radius)) throw new NumberFormatException("Radius must ne numeric");
        if (Double.parseDouble(radius) <= 0) throw new NegativeValueException("Radius must be more than zero");
        this.radius = radius;
    }

    public Circle() throws NegativeValueException{
        this.radius = "7";
    }

    @Override
    public double length() {
        return 2 * Math.PI * Double.parseDouble(radius);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(Double.parseDouble(radius), 2);
    }

    @Override
    public String toString() {
        return String.format("Круг\nРадиус: %s", this.radius);
    }

    private boolean isNumeric(String radius) {
        boolean result = true;
        try {
            Double.parseDouble(radius);
        } catch (NumberFormatException e) {
            return false;
        }

        return result;
    }
}
