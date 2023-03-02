package practice.lesson1;

public class Car extends Transport{
    public Car(String color, int weight, int maxSpeed, String brandName, String modelName) {
        super(color, 4, weight, maxSpeed, brandName, modelName);
    }
    public Car() {
        super("Black", 4, 1500, 350, "Tesla", "Model S");
    }
}



