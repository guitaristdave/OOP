package homeworks.lesson3.Figures;

import homeworks.lesson3.Exceptions.IncorrectTriangleException;
import homeworks.lesson3.Exceptions.NegativeValueException;
import homeworks.lesson3.Figures.Base.Polygonal;

public class Triangle extends Polygonal {
    public Triangle(String a, String b, String c) throws NegativeValueException, IncorrectTriangleException {
        super(new String[] { a, b, c });
    }

    public Triangle() throws NegativeValueException, IncorrectTriangleException {
        this("3", "4", "5");
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        double side1 = Double.parseDouble(sides[0]);
        double side2 = Double.parseDouble(sides[1]);
        double side3 = Double.parseDouble(sides[2]);
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public String toString() {
        return String.format("Треугольник\nСторона a: %s\nСторона b: %s\nСторона c: %s", sides[0], sides[1],
                sides[2]);
    }

    
}
