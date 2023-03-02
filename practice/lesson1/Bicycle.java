package practice.lesson1;

public class Bicycle extends Transport {
    public Bicycle(String color, int weight, int maxSpeed, String brandName, String modelName) {
        super(color, 2, weight, maxSpeed, brandName, modelName);
    }
    public Bicycle() {
        super("Black", 2, 15, 60, "StarTrek", "Omega");
    }
}


