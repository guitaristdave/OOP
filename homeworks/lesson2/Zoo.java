import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();


    public void add(Animal item) {
        this.animals.add(item);
    }

    public void delete(int index) {
        this.animals.remove(index);
    }

    public void showAnimal(int index) {
        System.out.println(this.animals.get(index));
    }

    public void showAll() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void getRoar(int index) {
        this.animals.get(index).roar();
    }

    public void allRoar() {
        for (Animal animal : animals) {
            animal.roar();
        }
    }
}
