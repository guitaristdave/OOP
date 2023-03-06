package practice.lesson2;

public class Triangle extends Figure implements Perimeter{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt((p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC)));
    }

    @Override
    public String toString() {
        String result = String.format("%s\nP: %.2f", super.getInfo(this), this.getPerimeter());
        return result;
    }
}

