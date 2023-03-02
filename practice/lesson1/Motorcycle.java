package practice.lesson1;

public class Motorcycle extends Transport{

    
    public Motorcycle(String color, int weight, int maxSpeed, String brandName, String modelName) {
        super(color, 2, weight, maxSpeed, brandName, modelName);
    }

    public Motorcycle() {
        super("Black", 2, 500, 300, "Kawasaki", "Fast&Furious");
    }
}
