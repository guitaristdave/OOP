

using System.Collections;

public class FigArray<T> where T : Figure
{
    private ArrayList storage = new ArrayList();

    public void add(Figure obj)
    {
        this.storage.Add(obj);
    }

    public void delete(int index) {
        this.storage.Remove(index);
    }

    public void showFigures() {
        foreach (Figure item in this.storage)
        {
            Console.WriteLine(item);
            Console.WriteLine("--------");
        }
    }

    public T getFigure(int index) {
        return (T) this.storage[index];
    }

    

}