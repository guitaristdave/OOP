package practice.lesson2;

public class Rectangle extends Figure implements Perimeter {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String toString() {
        String result = String.format("%s\nP: %.2f", super.getInfo(this), this.getPerimeter());
        return result;
    }

}
