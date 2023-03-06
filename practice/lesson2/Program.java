package practice.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();
        figures.add(new Circle(10));
        figures.add(new Rectangle(10, 12));
        figures.add(new Triangle(10,10 ,10));
        figures.add(new Square(10));
        for (Figure figure : figures) {
            demo(figure);
        }
        
    }

    static void demo (Figure obj) {
        System.out.println(obj);
        System.out.println("--------");
    }
}
