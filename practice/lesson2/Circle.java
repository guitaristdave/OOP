package practice.lesson2;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        if (!isCorrect()) {
            this.radius = 0;
            System.out.println("Данные некорректны");
        }
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public boolean isCorrect() {
        if (this.radius > 0)
            return true;
        else
            return false;
    }
}
