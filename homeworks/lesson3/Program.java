package homeworks.lesson3;

import java.util.Collections;
import java.util.List;

import homeworks.lesson3.Exceptions.IncorrectTriangleException;
import homeworks.lesson3.Exceptions.NegativeValueException;
import homeworks.lesson3.Figures.Circle;
import homeworks.lesson3.Figures.Rectangle;
import homeworks.lesson3.Figures.Square;
import homeworks.lesson3.Figures.Triangle;
import homeworks.lesson3.Figures.Base.Figure;
import homeworks.lesson3.FiguresArray.FigArray;

public class Program {
    public static void main(String[] args)
            throws NegativeValueException, IncorrectTriangleException, NumberFormatException {

        // Инициализация класса, хранящего фигуры в списке
        FigArray storage = new FigArray();

        // Создание фигур
        Figure square = new Square("5");
        Figure rectangle = new Rectangle("5", "4");
        Figure triangle = new Triangle("2", "3", "4");
        Figure circle = new Circle("7");
        Figure sq = new Square();

        // Добавление фигур в список
        storage.add(square);
        storage.add(rectangle);
        storage.add(triangle);
        storage.add(circle);
        storage.add(sq);

        // Удаление фигуры по индексу
        storage.delete(4);

        // сортировка по площади фигур
        storage.sort();

        // Показать все фигуры и их параметры(длины)
        storage.showFigures();

        // Показать всю информацию о фигурах, включая площадь, периметр/длину
        storage.showAll();

    }

}
