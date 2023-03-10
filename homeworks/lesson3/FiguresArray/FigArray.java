package homeworks.lesson3.FiguresArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import homeworks.lesson3.Figures.Base.Figure;
import homeworks.lesson3.Figures.Base.Lengthable;
import homeworks.lesson3.Figures.Base.Perimetrable;

public class FigArray {
    private List<Figure> storage = new ArrayList<Figure>();

    public void add(Figure obj) {
        this.storage.add(obj);
    }

    public void delete(int index) {
        this.storage.remove(index);
    }

    public void showFigures() {
        for (Figure figure : storage) {
            System.out.println(figure);
            System.out.println("------");
        }
    }

    public void showAll() {
        for (Figure figure : storage) {
            System.out.println(figure);
            System.out.printf("Площадь: %.2f\n", figure.area());
            if (figure instanceof Lengthable) {
                System.out.printf("Длина окружности: %.2f\n", ((Lengthable) figure).length());
            }
            if (figure instanceof Perimetrable) {
                System.out.printf("Периметр: %.2f\n", ((Perimetrable) figure).perimeter());
            }
            System.out.println("------");
        }

    }

    public void sort() {
        Collections.sort(this.storage);
    }

}
