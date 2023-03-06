package practice.lesson2;

public abstract class Figure {

    public abstract double getArea();


    public String getInfo(Figure obj) {
        String result = String.format("%s\nS: %.2f", obj.getClass().getSimpleName(), obj.getArea());
        return result;
    }

    
}
